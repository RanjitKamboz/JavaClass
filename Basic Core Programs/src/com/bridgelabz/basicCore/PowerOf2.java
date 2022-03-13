package com.bridgelabz.basicCore;

import java.util.Scanner;

public class PowerOf2 {
    /* his program takes a command-line argument N and prints a table of the powers of 2
     that are less than or equal to 2^N.
     */
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Power of 2^" + num + " is: " + (Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all till Power Value " + num);

        for (int i = 1; i <= num; i++) {
            System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
        }
    }
}