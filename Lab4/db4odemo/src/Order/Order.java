/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Order {
    public String name;
    public String customer;
    public String receiver;
    public String sender;
    public String status;
    public String result;

    public Order(String name, String customer, String status) {
        this.name = name;
        this.customer = customer;
        this.status = status;
    }
    
    
}
