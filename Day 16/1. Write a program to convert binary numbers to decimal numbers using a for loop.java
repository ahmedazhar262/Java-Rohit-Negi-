// Write a program to convert binary numbers to decimal numbers using a for loop.


import java.util.*;
public class Binary_to_Decimal{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Binary Number:");
        int num= sc.nextInt();
        
        int new_num= num;

        int rem, ans=0;
        int mul=1;

        while(num>0){
            rem= num%10;
            num= num/10;
            ans= rem*mul + ans;
            mul= mul*2;
        }

        System.out.println("Decimal Number of "+ new_num + " Is "+ ans);
    }
}
