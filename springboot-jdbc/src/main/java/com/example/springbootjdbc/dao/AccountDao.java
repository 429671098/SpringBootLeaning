package com.example.springbootjdbc.dao;

import com.example.springbootjdbc.entity.Account;

import java.util.List;

public interface AccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
