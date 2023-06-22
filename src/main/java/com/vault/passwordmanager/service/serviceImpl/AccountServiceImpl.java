package com.vault.passwordmanager.service.serviceImpl;

import com.vault.passwordmanager.model.Account;
import com.vault.passwordmanager.repository.AccountRepository;
import com.vault.passwordmanager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }
}
