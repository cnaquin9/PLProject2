package Naquin.ui;


import Naquin.business.Account;
import Naquin.business.CheckingAccount;

public class AccountApp {

    public static void main(String[] args) {

        //Create a new checking account object
        CheckingAccount checkingaccount = new CheckingAccount();

        //Create new account object
        Account account = new Account();

        //Set starting balance
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

        //Create a while loop so the program continues until the user replies "n"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            String transaction =
                    Console.getString("Withdrawal or deposit? ");
            double amount =
                    Console.getDouble("Amount: ");
            //If statements to decifer between withdrawals and deposits
            if (transaction.equalsIgnoreCase("w") && amount <= account.getBalance()) { //Make sure withdrawal is not more than balance
                account.withdraw(amount);
            } else if (transaction.equalsIgnoreCase("d") && amount <= 10000) { //Make sure deposit is not more than $10,000
                account.deposit(amount);
            }else{
                Console.displayLine("Your transaction cannot be completed.");
            }
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): "); //Ask to continue until "n"
            Console.displayLine();
            }

        //Once user answers "n", display monthly fees and final balance
        Console.displayLine("Monthly Fees");
        checkingaccount.setMonthlyFee(1);
        Console.displayLine("Checking fee:      " + checkingaccount.getMonthlyFeeFormatted());
        Console.displayLine();
        Console.displayLine("Final Balance");
        checkingaccount.subtractMonthlyFee();
        Console.displayLine("Checking: " + account.getBalanceFormatted());


        }
    }


