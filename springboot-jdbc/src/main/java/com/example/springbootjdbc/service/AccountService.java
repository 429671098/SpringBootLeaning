package com.example.springbootjdbc.service;

import com.example.springbootjdbc.entity.Account;

import java.util.List;

public interface AccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
