//  Write a program to convert Octal numbers to decimal numbers.

import java.util.*;
public class Octal_to_Decimal{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Octal Number:");
        int num= sc.nextInt();
        
        int new_num= num;

        int rem, ans= 0;
        int mul=1;

        while(num>0){
            rem=num%10;
            num=num/10;
            ans= rem*mul+ans;
            mul= mul*8;

        }
        System.out.println("Octal Number of "+ new_num + " Is: "+ ans);
    }
}