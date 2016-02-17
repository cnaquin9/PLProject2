package Naquin.business;

import Naquin.account.interfaces.Balanceable;
import Naquin.account.interfaces.Depositable;
import Naquin.account.interfaces.Withdrawable;

import java.text.NumberFormat;


public class Account implements Balanceable,Depositable,Withdrawable {


    public static double balValue = 0;
    public static double depValue = 0;
    public static double withValue = 0;

    public void setBalance(double balValue) {
        this.balValue = balValue;
    }

    public double getBalance() {
        return balValue;
    }

    public void deposit(double depValue) {
        this.depValue = depValue;
        this.setBalance(balValue + depValue);
    }

    public void withdraw(double withValue) {
        this.withValue = withValue;
        this.setBalance(balValue - withValue);
    }

    public String getBalanceFormatted() {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String balanceFormatted = money.format(balValue);
        return balanceFormatted;
    }





}




