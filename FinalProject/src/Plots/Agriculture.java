/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plots;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Agriculture extends Plot{

    private static int count = 1;
    public Agriculture(String name, double size, String location, double cost) {
        super(count, name, size, location, cost);
        count++;
    }  
    
}
