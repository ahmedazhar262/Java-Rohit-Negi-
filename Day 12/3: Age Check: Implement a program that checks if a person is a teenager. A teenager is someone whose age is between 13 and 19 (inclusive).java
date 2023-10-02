//  Age Check: Implement a program that checks if a person is a teenager.
//  A teenager is someone whose age is between 13 and 19 (inclusive).

import java.util.*;
public class Check{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        if(num>=13 && num<=19){
            System.out.println("YES: You are a teenager");
        }
        else{
            System.out.println("NO");
        }
    }
}