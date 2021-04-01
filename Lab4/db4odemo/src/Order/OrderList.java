/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class OrderList {
    public ArrayList<Order> orderList;

    public OrderList() {
        orderList = new ArrayList();
    }
    
    public Order getOrder(String name, String sender){
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).name.equals(name) && orderList.get(i).customer.equals(sender) && orderList.get(i).status.equals("Placed")){
                return orderList.get(i);
            }
        }
        return null;
    }
    
    
}
