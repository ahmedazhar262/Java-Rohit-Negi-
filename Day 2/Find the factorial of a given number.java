import java.util.*;

public class Factorial{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

            System.out.println("Enter the Number:");
            int num= sc.nextInt();

            long fact= 1;
            
            if(num<0)
             System.out.println("This no is not define in -ve");

            else
             for(int i=1; i<=num; i++)
              fact *=i;
            
            System.out.println("The factorial of "+ num+ " is "+fact);

        
    }
}