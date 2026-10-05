/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktransactionsystem;
import java.util.*;

/**
 *
 * @author acer
 */
public class BankManager {
    // List - stores all transactions
    private List<Transaction> transactions = new ArrayList<>();

    // Set - stores unique transaction types
    private Set<String> transactionTypes = new HashSet<>();

    // Map - stores transaction ID and amount
    private Map<Integer, Double> transactionMap = new HashMap<>();

    // Add transaction
    public void addTransaction(Transaction transaction) {

        transactions.add(transaction);

        transactionTypes.add(transaction.getType());

        transactionMap.put(
            transaction.getTransactionId(),
            transaction.getAmount()
        );
    }

    // Display all transactions
    public void displayTransactions() {

        System.out.println("\nTransaction Details");
        System.out.println("-------------------------------");
        System.out.println("ID\tType\tAmount");

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }

    // Display transaction types
    public void displayTransactionTypes() {

        System.out.println("\nTransaction Types:");

        for (String type : transactionTypes) {
            System.out.println(type);
        }
    }

    // Display transaction map
    public void displayTransactionMap() {

        System.out.println("\nTransaction ID and Amount:");

        for (Map.Entry<Integer, Double> entry
                : transactionMap.entrySet()) {

            System.out.println(
                "Transaction ID: " + entry.getKey()
                + "  Amount: rs." + entry.getValue()
            );
        }
    }

    // Calculate total transaction amount
    public void calculateTotal() {

        double total = 0;

        for (Transaction transaction : transactions) {
            total += transaction.getAmount();
        }

        System.out.println(
            "\nTotal Transaction Amount: rs." + total
        );
    }

    // Search transaction
    public void searchTransaction(int id) {

        for (Transaction transaction : transactions) {

            if (transaction.getTransactionId() == id) {

                System.out.println("\nTransaction Found:");
                transaction.displayTransaction();
                return;
            }
        }

        System.out.println("\nTransaction not found.");
    }
}
    

