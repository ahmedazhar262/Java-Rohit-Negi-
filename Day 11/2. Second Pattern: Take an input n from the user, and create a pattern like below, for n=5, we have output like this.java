//          1
//        1 2 3
//      1 2 3 4 5
//    1 2 3 4 5 6 7
//  1 2 3 4 5 6 7 8 9


import java.util.*;

public class Patter{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

            System.out.println("Enter Number:");
            int num= sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=num-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=2*i-1; k++){
                    System.out.print(k+ " ");
                }
                System.out.println(" ");
            }
        
    }
}