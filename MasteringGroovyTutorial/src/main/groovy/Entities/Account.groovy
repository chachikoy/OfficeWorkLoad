package Entities

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Created by cnapoles on 6/15/17.
 */
@EqualsAndHashCode(includes = ['id'])
@ToString(includeNames = true)
class Account{
    Integer id
    BigDecimal balance

    def deposit(amount){
        balance += amount
    }

    def withdraw(amount){
        balance -= amount
    }
}