//Print all Odd numbers from 1 to n, take n as an input from the user.
import java.util.*;
public class Print{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter a No:");
        int num= sc.nextInt();
        
        if(num==0){
                System.out.println("!Don't Enter 0");
            }

        for(int i=1; i<=num; i++){
             
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}