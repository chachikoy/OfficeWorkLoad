/*

package DAO

import Entities.Account
import com.sun.jmx.mbeanserver.Repository

import javax.sql.DataSource
import javax.swing.tree.RowMapper
import java.sql.ResultSet
import java.sql.SQLException

*//*

*/
/**
 * Created by cnapoles on 6/15/17.
 *//*
*/
/*

@Repository
class JdbcAccountDAO implements AccountDAO{
    static int nextId = 3
    JdbcTemplate jdbcTemplate

    @Autowired JdbcAccountDAO(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource)
    }

    public int createAccount(BigDecimal initialBalance){
        String sql = "insert into accounts(id, balance) values(?,?)"
        int id = nextId++
        int uc = jdbcTemplate.update(sql, id, initialBalance)
        return id;

    }

    public Account findAccountById(int id){
        String sql = "select * from accounts where id=?"
        jdbcTemplate.queryForObject(sql, accountMapper, id)
    }
*/
/*

    * Java approach: inner class
    * class AccountMapper implements RowMapper<Account>{
    * @Override
    * public Account mapRow(ResultSet rs, int rowNum ) throws SQLException{
    *   return new Account(); //create account from rs
    *   }
    * }
    *

*//*


    public List<Account> findAllAccounts(){
        String sql = "select * from accounts"
        jdbcTemplate.query(sql, accountMapper)
    }

    void updateAccount(Account account){
        String sql = "update account set balance =? where id=?"
        jdbcTemplate.update(sql, account.balance, account.id)
    }

    public void deleteAccount(int id){
        String sql = "delete from accounts where id=?"
        jdbcTemplate.update(sql, id)
    }

    def accountMapper = {ResultSet rs, int row ->
            new Account(id: rs.getInt('id'),
            balance: rs.getBigDecimal('balance'))
    } as RowMapper<Account>


}
*/
