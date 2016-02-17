package Naquin.business;

import java.text.NumberFormat;

/**
 * Created by Carley on 2/16/2016.
 */
public class CheckingAccount extends Account {

    //Initialize monthly fee variable
    public double monthlyFee = 1;

    //Create methods for the  montly fee
    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }
    public double getMonthlyFee(){
        return monthlyFee;
    }
    public String getMonthlyFeeFormatted(){
        NumberFormat fee = NumberFormat.getCurrencyInstance();
        String feeFormatted = fee.format(monthlyFee);
        return feeFormatted;
    }
    public void subtractMonthlyFee(){
        balValue = balValue - monthlyFee; //Subtract monthly fee from balance

    }
}
