package com.vault.passwordmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "userAccount")
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int uid;
    String name;
    String username;
    String email;
    String password;
    String accountType;
}
