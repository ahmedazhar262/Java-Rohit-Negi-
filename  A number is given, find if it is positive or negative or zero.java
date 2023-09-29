import java.util.*;
public class Sign{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st no: ");
        int a= sc.nextInt();
        

        if(a==0){
            System.out.println(a +" is Equal to 0");
        }
        else if(a>0)
          System.out.println(a + " is +ve Number");

        else
          System.out.println(a +" is -ve Number");
        
         
    }
}