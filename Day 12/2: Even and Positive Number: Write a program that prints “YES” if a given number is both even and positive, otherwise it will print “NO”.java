// Even and Positive Number: Write a program that prints “YES” if a given
// number is both even and positive, otherwise it will print “NO”.

import java.util.*;
public class Check{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        if(num%2==0 && num>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}