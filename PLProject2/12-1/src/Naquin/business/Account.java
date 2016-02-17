package Naquin.business;

import Naquin.account.interfaces.Balanceable;
import Naquin.account.interfaces.Depositable;
import Naquin.account.interfaces.Withdrawable;

import java.text.NumberFormat;


public class Account implements Balanceable,Depositable,Withdrawable {

    //Initiate variables
    public static double balValue = 0;
    public static double depValue = 0;
    public static double withValue = 0;

    //Implement setBalance method
    public void setBalance(double balValue) {
        this.balValue = balValue;
    }
    //Implement getBalance method
    public double getBalance() {
        return balValue;
    }
    //Implement deposit method
    public void deposit(double depValue) {
        this.depValue = depValue;
        this.setBalance(balValue + depValue); //Add deposit amount to balance
    }
    //Implement withdraw method
    public void withdraw(double withValue) {
        this.withValue = withValue;
        this.setBalance(balValue - withValue); //Subtract withdrawal amount from balance
    }

    public String getBalanceFormatted() {
        NumberFormat money = NumberFormat.getCurrencyInstance(); //Import and use number format to get currency formatting
        String balanceFormatted = money.format(balValue);
        return balanceFormatted;
    }





}




