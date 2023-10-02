// Take three numbers a,b,c from the user, print yes if a is either greater
// than b or c. Otherwise print NO.

import java.util.*;
public class Comparison{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();


        if(a>b || a>c){
            System.out.println(a+ " is greator than "+ b + ", "+ c);
        }
        else
         System.out.println(a+ " isn't greator than "+ b + ","+ c);
    }
}