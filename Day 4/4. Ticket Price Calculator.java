//Ticket Price Calculator: Create a program that asks the user for
//their age and checks if they qualify for a discounted ticket price
//(e.g., under 12 and over 65 get discounts), If they are eligible
//print “YES” else “NO

import java.util.*;
public class Ticket_Price_Calculator{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Age");
        int age= sc.nextInt();

        if(age<12 || age>65)
         System.out.println("Yes: You are eligible");

        else
         System.out.println("Sorry: You are not Eligible");

    }

}