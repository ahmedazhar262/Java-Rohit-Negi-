// 2: Find the factorial of a number n using a while loop and do a
// while loop.

import java.util.*;
public class Factorial{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        long fact= 1;

        int i=1;
        while(i<=num){
            fact*= i;
            i++;
        }
        System.out.println(fact);

    }
}