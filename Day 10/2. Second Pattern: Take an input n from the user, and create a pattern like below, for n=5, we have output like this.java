//          A
//        B B
//      C C C
//    D D D D
//  E E E E E


import java.util.*;

public class Pattern{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(j<=num-i){
                   System.out.print(" ");
                }

                else{
                  char c= (char) ('A' + i-1);
                    System.out.print(c);   
                }
            }
            System.out.println(" ");
           
        }
    }
}