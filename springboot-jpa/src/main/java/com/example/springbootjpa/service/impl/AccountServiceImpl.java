package com.example.springbootjpa.service.impl;

import com.example.springbootjpa.entity.Account;
import com.example.springbootjpa.repository.AccountRepository;
import com.example.springbootjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account add(Account account) {
        accountRepository.save(account);
        return account;
    }

    @Override
    public void update(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account findAccountById(int id) {
        Optional<Account> optional = accountRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        return accountRepository.findAll();
    }
}
