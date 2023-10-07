

import java.util.*;
public class Add_Digits{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num= sc.nextInt();

        int new_num= num;

        int rem, ans= 0;
        int mul=1;

        while(num!=0){
            rem=num%10;
            num/=10;
           ans= rem + ans;
           
        }

        System.out.println("Sum of digits of "+ new_num+ " Are " + ans);
    }
}