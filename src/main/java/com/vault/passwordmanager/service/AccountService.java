package com.vault.passwordmanager.service;

import com.vault.passwordmanager.model.Account;

import java.util.List;

public interface AccountService {
    Account addAccount(Account account);
    Account updateAccount(int id, Account account);
    void deleteAccount(int id);
    List<Account> getAllAccounts();
    Account retrieveAccount(int id);
}
