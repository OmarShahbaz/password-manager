package com.vault.passwordmanager.service;

import com.vault.passwordmanager.model.Account;

public interface AccountService {
    Account addAccount(Account account);
    Account updateAccount(int id, Account newAccount);
}
