import java.util.*;

public class Sum_of_Square{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        
        int sum=0;

       for(int i=1; i<=n; i++)
         sum+=i*i*i;
        

        System.out.println(sum);
         
    }
}