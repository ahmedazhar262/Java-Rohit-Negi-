//          1
//        2 1
//      3 2 1
//    4 3 2 1
//  5 4 3 2 1


import java.util.*;
public class Pattern{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for( int k=i; k>=1; k--){
                System.out.print(k+ " ");
            }
            System.out.println(" ");
        }
    }
}