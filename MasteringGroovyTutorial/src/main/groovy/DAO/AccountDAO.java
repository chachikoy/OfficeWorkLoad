package DAO;

import Entities.Account;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by cnapoles on 6/15/17.
 */
public interface AccountDAO {
    int createAccount (BigDecimal initialBalance);
    Account findAccountById(int id);
    List <Account> findAllAccounts();
    void updateAccount(Account account);
    void deleteAccount(int Id);


}
