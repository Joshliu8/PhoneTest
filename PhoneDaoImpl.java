package com.jl.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
 
public class PhoneDaoImpl implements PhoneDao{
    // jdbc template
    @Resource(name="jdbcTemplate")
    private  JdbcTemplate jdbcTemplate;
    public int addPhone(String name , String brand,String price) {
    	System.out.println("add!");
        return jdbcTemplate.update("insert into Phone value(?,?,?)",name,brand,price);
    }
 
    public List<Phone> getAllPhone() {
        return jdbcTemplate.query("select * from Phone", new PhoneRowMapper());
    }
 
    private class PhoneRowMapper implements RowMapper<Phone>{
        @Override
        public Phone mapRow(ResultSet re, int arg1) throws SQLException {
            return new Phone(re.getString("name"),re.getString("brand"),re.getString("price"));
        }
 
    }
}
