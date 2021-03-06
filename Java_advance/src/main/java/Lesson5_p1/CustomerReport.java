/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5_p1;

/**
 *
 * @author keora
 */
public class CustomerReport {
    private Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int custIndex = 0; custIndex < bank.getNumOfCustomers(); custIndex++) {
            Customer customer = bank.getCustomer(custIndex);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acctIndex = 0; acctIndex< customer.getNumOfAccounts(); acctIndex++) {
                Account account = customer.getAccount(acctIndex);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }
}
