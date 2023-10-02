//  Temperature Range: Write a program that checks if a given temperature
// is suitable for swimming. If the temperature is between 70 and 90
// (Excluded) degrees Fahrenheit print yes, else NO.

import java.util.*;
public class Tepemperature{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Temperature in degree Fahreheit:");
        int temp= sc.nextInt();

        if(temp>60 && temp<90){
            System.out.println("YES");

        }
        else 
          System.out.println("NO");
    }
}
