import java.util.*;
public class Comparison{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st no: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b= sc.nextInt();

        if(a==b){
            System.out.println(" Both no are Equal ");
        }
        else if(a>b)
          System.out.println(a +" is greator than "+ b);

        else
          System.out.println(a +" is smaller than " +  b);
        
         
    }
}