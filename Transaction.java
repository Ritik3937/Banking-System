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
public class Transaction {

    private String transactionId;
    private String transactionAmount;
   

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Transaction(String transactionId, String transactionAmount) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
    }

    
    
    
}
