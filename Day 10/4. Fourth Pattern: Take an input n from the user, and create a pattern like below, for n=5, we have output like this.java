//         E
//       E D
//     E D C
//   E D C B
// E D C B A


import java.util.*;

public class Pattern{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number:");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-1; j++){
                System.out.print(" ");
            }
            for(int k=num; k>=num-i+1; k--){
                char d= (char) ('A' + k-1);
                System.out.print(d + " ");
            }
            System.out.println(" ");
        }
    }
}