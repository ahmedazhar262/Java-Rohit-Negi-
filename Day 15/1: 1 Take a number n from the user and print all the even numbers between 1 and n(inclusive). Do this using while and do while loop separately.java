// 1: Take a number n from the user and print all the even numbers
// between 1 and n(inclusive). Do this using while and do while loop
// separately.


import java.util.*;
public class Even_no{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        

        int i= 1;
        while(i<=num){
          if(i%2==0){
            System.out.println(i+ " ");
          }
          i++;
        }
    }
}