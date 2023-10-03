//  Write a program to convert decimal numbers to binary numbers using a for loop.


import java.util.*;
public class Decimal_to_Binary{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Decimal Number:");
        int num= sc.nextInt();

        int rem, ans= 0;
        int mul=1;

        while(num>0){
            rem=num%2;
            num=num/2;
            ans= rem*mul+ans;
            mul= mul*10;

        }
        System.out.println("Binary Number of "+ num + " Is: "+ ans);
    }
}
