package com.example.springbootjpa.service;
import com.example.springbootjpa.entity.Account;
import java.util.List;

public interface AccountService {
    Account add(Account account);

    void update(Account account);

    void delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
