package com.pluralsight;

import java.util.Scanner;

public class financialCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


    }


    public static int mortgageCalc (int principal, double interestRate, int months){
       return (int) (principal * interestRate * (Math.pow((1 + interestRate),months)) / ((Math.pow((1 + interestRate),months)) - 1));
    }

    public static int futureVal(){
      return 1;
    }

    public static int presentVal(){
        return 1;
    }


}
