package com.vault.passwordmanager.controller;

import com.vault.passwordmanager.model.Account;
import com.vault.passwordmanager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    private Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
    @PutMapping("/update/{id}")
    private Account updateAccount(@PathVariable int id, @RequestBody Account newAccount){
        return accountService.updateAccount(id,newAccount);
    }
    @DeleteMapping("/delete/{id}")
    private void deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
    }
    @GetMapping("/all")
    private List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }
}
