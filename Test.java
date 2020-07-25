package com.jl.demo;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
 
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/application.xml");

        DataSource ds = (DataSource) context.getBean("dataSource");
        System.out.println(ds);

        JdbcTemplate jt = (JdbcTemplate) context.getBean("jdbcTemplate");
        System.out.println(jt);
 
        PhoneService phoneService = (PhoneService) context.getBean("phoneService");
        phoneService.add("mate9","Huawei","4000" );
        phoneService.add("hongmi","xiaomi","2000");
        System.out.println(phoneService.getAll());
    }
}