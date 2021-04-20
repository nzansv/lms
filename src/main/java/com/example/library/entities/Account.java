package com.example.library.entities;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name= "accounts")
@Component
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Integer id;
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy="account",fetch = FetchType.EAGER, optional = false)
    private	Member	member;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
