//  Write a program to convert decimal numbers to Octal numbers.

import java.util.*;
public class Decimal_to_Octal{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Decimal Number:");
        int num= sc.nextInt();
        
        int new_num= num;

        int rem, ans= 0;
        int mul=1;

        while(num>0){
            rem=num%8;
            num=num/8;
            ans= rem*mul+ans;
            mul= mul*10;

        }
        System.out.println("Octal Number of "+ new_num + " Is: "+ ans);
    }
}
