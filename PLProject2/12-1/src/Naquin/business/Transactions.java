package Naquin.business;

import Naquin.account.interfaces.Depositable;
import Naquin.account.interfaces.Withdrawable;

/**
 * Created by Carley on 2/16/2016.
 */
public class Transactions {
    //Create methods of possible transactions
    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }
}
