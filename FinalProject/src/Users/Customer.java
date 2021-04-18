/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Customer {
    private static int count = 1;
    String name;
    String username;
    String password;
    int id;

    public Customer(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = count;
        count++;
    }
    
    
}
