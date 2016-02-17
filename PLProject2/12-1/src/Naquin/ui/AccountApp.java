package Naquin.ui;


import Naquin.account.interfaces.Balanceable;
import Naquin.account.interfaces.Depositable;
import Naquin.business.Account;
import Naquin.business.CheckingAccount;
import Naquin.business.Transactions;

public class AccountApp {

    public static void main(String[] args) {

        CheckingAccount checkingaccount = new CheckingAccount();

        Account account = new Account();
        double start = 1000;
        account.setBalance(start);

        //Prints welcome statement
        Console.displayLine("Welcome to Account Calculator");
        Console.displayLine();

        //Print starting balance
        Console.displayLine("Starting Balance \nChecking: " + account.getBalanceFormatted());
        Console.displayLine();

        //Tell customer to enter transactions
        Console.displayLine("Enter transactions for the month");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")){

            String transaction =
                    Console.getString("Withdrawal or deposit? ");
            double amount =
                    Console.getDouble("Amount: ");
            if (transaction.equalsIgnoreCase("w")) {
                account.withdraw(amount);
            }else if (transaction.equalsIgnoreCase("d")) {
                account.deposit(amount);
            }
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
            }

        Console.displayLine("Monthly Fees");
        checkingaccount.setMonthlyFee(1);
        Console.displayLine("Checking fee:      " + checkingaccount.getMonthlyFeeFormatted());
        Console.displayLine();
        Console.displayLine("Final Balance");
        checkingaccount.subtractMonthlyFee();
        Console.displayLine("Checking: " + account.getBalanceFormatted());


    }
}


