package com.bridgelabz.basicCore;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        System.out.println("Enter Dividend");
        Scanner r =new Scanner(System.in);
        int dividend=r.nextInt();
        System.out.println("Enter Divisor");
        int divisor = r.nextInt();



        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

