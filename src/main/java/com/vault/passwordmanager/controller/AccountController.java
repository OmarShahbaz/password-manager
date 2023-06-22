package com.vault.passwordmanager.controller;

import com.vault.passwordmanager.model.Account;
import com.vault.passwordmanager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/message")
    String display(){
        return "Hello Java!";
    }
    @PostMapping("/add")
    Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
}
