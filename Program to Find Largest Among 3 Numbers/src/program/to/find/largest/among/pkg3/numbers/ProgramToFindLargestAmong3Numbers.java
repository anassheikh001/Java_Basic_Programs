
package program.to.find.largest.among.pkg3.numbers;

import java.util.Scanner;


public class ProgramToFindLargestAmong3Numbers {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value of A =");
        int a = sc.nextInt();
        
        System.out.println("Enter first value of B =");
        int b = sc.nextInt();
        
         System.out.println("Enter first value of C =");
        int c = sc.nextInt();
        
        if( a>=b && a>=c)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+" is greatest");
        }
        else
        {
            System.out.println(c+" is greatest");
        }
    }
    
}
