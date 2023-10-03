// 6: Give a number n, find if it is prime or not, use a while loop and break here to solve it

import java.util.*;
public class Prime_Number{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        if(num<2){
            System.out.println("Please Enter a Number Greator than 2");
        }
        else{

           
          boolean isPrime= true;
          int i=2;
          while(i*i<=num){
              if(num%i==0){
                isPrime= false;
                break;
              }
              i++;
          }
          if(isPrime){
            System.out.println(num+ " is a Prime Number");
          }
          else{
            System.out.println(num + " ia Not a Prime Number");
          }
       } 
    }
}