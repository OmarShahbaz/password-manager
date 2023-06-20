package com.vault.passwordmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "userAccount")
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int uid;

    String username;

    String email;
    String password;
}
