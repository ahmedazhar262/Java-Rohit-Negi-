


//Take a number in input (ex n) and print the corresponding month to it. 
//Ex: for n=1, print january, n=2, print feburary like this you need to give output. 
//It is given that n will be greaterthan 0 and less than 13.

import java.util.*;
public class Calender{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("..........!Kindly enter no between o and 13..........\nEnter the no to print name of a Month\n");
        int num= sc.nextInt();

        switch(num)
        {
            case 1: System.out.println(" Janauary");
            break;
            case 2: System.out.println(" February");
            break;
            case 3: System.out.println(" March");
            break;
            case 4: System.out.println(" April");
            break;
            case 5: System.out.println(" May");
            break;
            case 6: System.out.println(" June");
            break;
            case 7: System.out.println(" July");
            break;
            case 8: System.out.println(" August");
            break;
            case 9: System.out.println(" September");
            break;
            case 10: System.out.println(" October");
            break;
            case 11: System.out.println(" November");
            break;
            case 12: System.out.println(" December");
            break;
            default : System.out.println("!Please Input Valid no Between 1 and 13 ");
            break;

        }
    }
}