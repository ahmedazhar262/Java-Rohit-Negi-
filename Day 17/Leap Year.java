// Leap Year Print

import java.util.*;
public class Leap_Year{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num= sc.nextInt();

        if(num%400==0)
          System.out.println(num + " is Leap Year");

        else if(num%4==0  && num%100!=0)
          System.out.println(num + " is Leap Year");

        else
          System.out.println(num + " is not a Leap Year");
    
    }
}