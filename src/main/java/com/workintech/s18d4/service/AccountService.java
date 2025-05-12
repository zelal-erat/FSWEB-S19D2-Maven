package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Account;
import java.util.List;

public interface AccountService {
    Account save( Account account);
    List<Account> findAll();
    Account find(Long id);
    Account delete(Long id);
}