//Print all numbers from 1 to n, which is divisible by 4. Take n as an input from the user

import java.util.*;
public class Divisibility{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            if(i%4==0){
                System.out.println(i);
            }
        }
    }
}