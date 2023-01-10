/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author Sarthak
 */
public class Operation {

    public static void printDetails(UserRegistration userRegistration) {
        System.out.println("user Name" +       userRegistration.getUserName());
        System.out.println(" user Birtdate " +  userRegistration.getBirthDate());
        System.out.println("user Mobile number"+ userRegistration.getMobileNumber());
        System.out.println("user Email"   + userRegistration.getEmailId());
        
        
        
        
        
    }
}
