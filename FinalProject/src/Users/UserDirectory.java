/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Email.Email;
import java.util.ArrayList;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class UserDirectory {
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList<>();
    }
    
    public void addUser(String name, String username, String password, String pno, String address, String current_address, String email, String role){
        userList.add(new User(name, username, password, pno, address, current_address, email, role));
        Email mailSender = new Email();
        mailSender.sendEmail(email, "Registration-Successful", "You have successfuly registered with Space Finder!");
        
    }
    
    public String getRoleFromLogin(String username, String password){
        for(int i=0; i<userList.size(); i++){
            if(userList.get(i).username.equals(username) && userList.get(i).password.equals(password)){
                return userList.get(i).role;
            }
        }
        return "UserNotFound";
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public void removeCust(Customer c){
        userList.remove(c);
    }
    
}
