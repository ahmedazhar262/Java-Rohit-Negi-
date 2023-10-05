

import java.util.*;
public class Decimal_to_Binary{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num= sc.nextInt();

        int new_num= num;

        int rem, sum= 0;
        int mul=1;

        while(num>0){
            rem=num%2;
            num/=2;
            sum+=mul*rem;
            mul= mul*10;
        }

        System.out.println("The the output of "+ new_num+ " Is " + sum);
    }
}