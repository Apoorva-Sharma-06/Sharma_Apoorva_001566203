/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private ArrayList<Order> orderList;
    public Customer() {
        orderList = new ArrayList();
    }
}
