/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.Scanner;

/**
 *
 * @author Sarthak
 */
public class UserInput {
public static String userID="Ritik";
public static String userPassword="3937";


    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("User ID");
        String userId = sc.next();
        System.out.println("User Id  " + userId);
       System.out.println("  Password");
        String password = sc.next();
        System.out.println("Password " + password);
        if(userId.equals(UserInput.userID)&&password.equals(UserInput.userPassword)){
          System.out.println("User Found");
          System.out.println("User Registered");
          
        }else{
            System.out.println("User Invalid");
                      System.out.println("User not Registered");

        }
    }

}
