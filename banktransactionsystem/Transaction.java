/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktransactionsystem;

/**
 *
 * @author acer
 */
public class Transaction {
    
    private int transactionId;
    private String type;
    private double amount;

    public Transaction(int transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void displayTransaction() {
        System.out.println(
            transactionId + "  " + type + "  rs." + amount
        );
    }
}
    
