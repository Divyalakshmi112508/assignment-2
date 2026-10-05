/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banktransactionsystem;
import java.util.*;
/**
 *
 * @author acer
 */
public class BankTransactionSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                BankManager bank = new BankManager();

        // Add transactions
        bank.addTransaction(
            new Transaction(1001, "Deposit", 5000));
        

        bank.addTransaction(
            new Transaction(1002, "Withdrawal", 2000));
        

        bank.addTransaction(
            new Transaction(1003, "Deposit", 3000));
        

        bank.addTransaction(
            new Transaction(1004, "Transfer", 1500));
        

        System.out.println("====================================");
        

        System.out.println("BANK TRANSACTION SYSTEM");
        

        System.out.println("====================================");
        

        // Display transactions
        bank.displayTransactions();

        // Display unique transaction types
        bank.displayTransactionTypes();

        // Display Map
        bank.displayTransactionMap();

        // Calculate total
        bank.calculateTotal();

        // Search transaction
        bank.searchTransaction(1003);
    }
}
        // TODO code application logic here
    
    

