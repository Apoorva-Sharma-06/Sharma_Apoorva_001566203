/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Email.Email;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Test {
    public static void main(String[] args){
        Email email = new Email();
        String to = "hrishi101.bhide@gmail.com";
        String subject = "Hello";
        String body = "How are you beautiful??";
        
        email.sendEmail(to, subject, body);
    }
}
