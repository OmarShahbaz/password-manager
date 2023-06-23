package com.vault.passwordmanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "userAccount")
@Data
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
