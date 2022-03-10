package LogicalProgramming;

import java.util.Scanner;

public class FindReverse {
    public static void main(String[] args) {
        int num,temp,reverse=0,remainder;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp!=0) {
            remainder=temp%10;
            System.out.println( +remainder);

            reverse=reverse*10+remainder;
            System.out.println(+reverse);

            temp=temp/10;
            System.out.println(+temp);
        }
        System.out.println("reverse of number is "+reverse);
    }

}

