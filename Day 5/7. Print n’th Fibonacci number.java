import java.util.*;

public class Sum_of_Square{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        int a= 0;
        int b= 1;
        
        System.out.println(a+" "+b);

        for(int i=1; i<=n; i++){
            
            int fib= a+b;
            System.out.println(fib);

            a=b;
            b=fib;
        }
      
         
    }
}