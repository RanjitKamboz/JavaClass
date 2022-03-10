package com.bridgelabz.basicCore;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x, y;
        int temp;

        // create Scanner class object
        // to read input
        System.out.println("Enter x value");
        Scanner r =new Scanner(System.in);
        x=r.nextInt();
        System.out.println("Enter y value");
        y = r.nextInt();


        temp = x;
        x = y;
        y = temp;

        System.out.println("Values After Swapping,");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}

