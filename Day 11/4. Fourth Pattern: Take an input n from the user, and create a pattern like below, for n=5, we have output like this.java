//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *
//             * * * * *
//              * * * *
//               * * *
//                * *
//                 *


import java.util.*;

public class Pattern{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();
      // First Upper Half
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println(" ");  
        }
       // First Lower Half
         for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println(" ");  
        }
    }
}