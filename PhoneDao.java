package com.jl.demo;
import java.util.List;
public interface PhoneDao {
	 /**
     * @param name
     * @param price
     * @return int
     */
    public int addPhone(String name , String brand,String price);
 
    /**
     * @return List
     */
    public List<Phone> getAllPhone();
}
