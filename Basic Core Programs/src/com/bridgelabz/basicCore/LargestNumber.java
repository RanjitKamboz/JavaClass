package com.bridgelabz.basicCore;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 15, n2 =5, n3 = 50;
        if (n1 > n2 && n1 > n3)
            System.out.println(n1+  "is largest mumber");
        else if (n2>n1 && n2 > n3)
            System.out.println(n2+ "is largest number") ;
        else
            System.out.println(n3+ "is  largest number");
    }
}
