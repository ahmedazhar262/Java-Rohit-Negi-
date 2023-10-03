//  Given a number n, print all the numbers from 1 to n(inclusive)
// which are not divisible by 3 and 5.



import java.util.*;
public class Number_Print{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        // I have solved this question using while loop

        int i=1;
        while(i<=num){
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}