// Write a program to convert binary to Octal numbers


import java.util.*;
public class Binary_to_Octal{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Binary Number");
        int num= sc.nextInt();

        int num_s= num;


        int rem, sum=0;
        int mul=1;
        // This code for Binary to Decimal.
        while(num>0){
            rem= num%10;
            num= num/10;
            sum= rem*mul +sum;
            mul= mul*2;
        }
        int remi, summ=0;
        int mull=1;
        // This while loop for Decimal to Octal Conversaton 
        while(sum>0){
            remi= sum%8;
            sum= sum/8;
            summ= remi*mull + summ;
            mull= mull*10;
        }
        System.out.println("Conversation of "+ num_s + " Is " + summ);

    }
}