//There is an Arithmetic Progression, First number is 220 and Common
//Difference is 7. So print all the numbers from 220 to 730 which follow the AP.

import java.util.*;
public class AP{
    public static void main(String [] args){

        //Given
        int a= 220;
        int d= 7;
        
        int n= 730;

        for(int i=a; a<=730; i+=d)
          System.out.println(i);
    }
}