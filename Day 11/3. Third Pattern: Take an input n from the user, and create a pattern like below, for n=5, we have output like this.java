//           A
//         A B A
//       A B C B A
//     A B C D C B A
//   A B C D E D C B A


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
            for(int j=1; j<=i; j++){
                char c=(char) ('A'+ j-1);
                System.out.print(c+ " ");
            }
            for(int k=i-1; k>=1; k--){
                char d= (char) ('A'+ k-1);
                 System.out.print(d+ " ");
            }
            System.out.println(" ");
        }
    }
}