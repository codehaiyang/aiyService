package com.sbdemo.controller;


import com.sbdemo.bean.Account;
import com.sbdemo.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    IAccountService iAccountService;

    @ApiOperation(value = "添加账户",notes = "添加")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addAccount(@RequestParam(value = "name") String name,
                             @RequestParam(value = "money") double money){
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        int isAdd = iAccountService.add(account);
        if(isAdd == 1){
            return account.toString();
        }else{
            return "fail";
        }

    }

    @ApiOperation(value = "修改账户",notes = "修改")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id ,
                                 @RequestParam(value = "name",required = true) String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = iAccountService.update(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @ApiOperation(value = "查询账户",notes = "查询")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return iAccountService.findAccountList();
    }

    @ApiOperation(value = "根据ID查询账户",notes = "根据ID查询")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return iAccountService.findAccountById(id);
    }

}
