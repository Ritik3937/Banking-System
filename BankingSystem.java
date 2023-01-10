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
public class BankingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double transaction[] = new double[15];
        transaction[0] = 100;
        transaction[1] = 200;
        transaction[2] = 300;
        transaction[3] =400;
        transaction[4] = 500;
        transaction[5] = 600;
        transaction[6] = 700;
        transaction[7] = 800;
        transaction[8] = 900;
     

        UserRegistration userRegistration = new UserRegistration("Ritik", "06/07/2001", "992650", "Ritik@1230");
        Operation.printDetails(userRegistration);
        UserInput.getUserInput();
    }
}
