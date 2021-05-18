package com.example.springbootjpa.web;

import com.example.springbootjpa.entity.Account;
import com.example.springbootjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/list")
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        accountService.update(account);
        return "修改成功";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name, @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        accountService.add(account);
        return "新增成功";

    }

}
