package com.pluralsight;

import java.text.NumberFormat;
import java.util.Scanner;

public class financialCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Muhamrif BANK!");
        input.nextLine();
        System.out.println("Hope you are having an awesome day!");
        System.out.println("How can I help you today?");
        System.out.println("You can ask for:");
        System.out.println("Press 'M' for Mortgage Payment Calculator");
        System.out.println("Press 'F' for Future Value Calculator");
        System.out.println("Press 'P' for Present Value Calculator");
        System.out.print("Please enter which calculator you'd like to use: ");
        String userCalc = input.nextLine();

        if (userCalc.equals("M")) {
            mortgage();
        }
    }
    public static void mortgage (){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Principal loan amount in USD: ");
        int principal =  input.nextInt() ;
        input.nextLine();

        System.out.println("Please enter the Annual Interest Rate: ");
        float annualInterest =  input.nextFloat();
        input.nextLine();

        System.out.println("Please enter the Period for the loan in Years: ");
        byte years = input.nextByte();
        input.nextLine();

        printMortgage(principal, annualInterest, years);
    }
    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        float monthlyInterest = annualInterest / 100 / 12;
        short numberOfPayments = (short) (years * 12);

        return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }
    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        double totalInterest = (mortgage * (years*12)) - principal;
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage) + ", with a total interest of: $" + totalInterest +" paid over " + years +" years.");
    }


}
