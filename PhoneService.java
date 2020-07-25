package com.jl.demo;
import java.util.List;
import javax.annotation.Resource;
 
public class PhoneService {
    @Resource(name="phoneDaoImpl")
    private PhoneDaoImpl phoneDaoImpl;
    public List<Phone> getAll() {
        return phoneDaoImpl.getAllPhone();
    }
 
    public int add(String name , String brand,String price) {
        return phoneDaoImpl.addPhone(name,brand, price);
    }
}
