package com.pluralsight;

import java.text.NumberFormat;
import java.util.Scanner;

public class financialCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Muhamrif BANK!");
        input.nextLine();

        mortgage();
    }
    public static void mortgage (){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Principal loan amount in USD: ");
        int principal =  input.nextInt();
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
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage) + ", with a total interest of: " + totalInterest +" paid over " + years +" years.");
    }


}
