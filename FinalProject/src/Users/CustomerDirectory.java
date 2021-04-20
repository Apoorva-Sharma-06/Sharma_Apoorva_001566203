/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class CustomerDirectory {
    private ArrayList<Customer> custList;

    public CustomerDirectory() {
        custList = new ArrayList<>();
    }
    
    public void addCustomer(String name, String username, String password, String pno, String address, String current_address, String email, String role){
        custList.add(new Customer(name, username, password, pno, address, current_address, email, role));
    }
    
    public String getRoleFromLogin(String username, String password){
        for(int i=0; i<custList.size(); i++){
            if(custList.get(i).username.equals(username) && custList.get(i).password.equals(password)){
                return custList.get(i).role;
            }
        }
        return "UserNotFound";
    }
    
    
}
