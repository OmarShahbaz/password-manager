package com.vault.passwordmanager.service.serviceImpl;

import com.vault.passwordmanager.model.Account;
import com.vault.passwordmanager.repository.AccountRepository;
import com.vault.passwordmanager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(int id, Account newAccount) {
        Account account = accountRepository.findById(id).get();
         account.setName(newAccount.getName());
         account.setAccountType(newAccount.getAccountType());
         account.setUsername(newAccount.getUsername());
         account.setEmail(newAccount.getEmail());
         account.setPassword(newAccount.getPassword());
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(int id) {
        Account account = accountRepository.findById(id).get();
        accountRepository.deleteById(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account retrieveAccount(int id) {
        Account account = accountRepository.findById(id).get();
        return account;
    }
}
