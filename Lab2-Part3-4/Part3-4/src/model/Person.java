/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Apoorva Sharma
 */
public abstract class Person {
    String name;
    int age;
    Address address;
    
    /**
     *
     */
    public abstract void setAge(int age);
    
    public abstract void setAddress(String house, String community, String city);
}
