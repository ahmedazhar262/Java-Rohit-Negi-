import java.util.*;

public class Square{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Valid no:");
        int length= sc.nextInt();

        int square= length*length;

        System.out.println("The square of"+ length + " are:"+square);

    }
}