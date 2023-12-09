
package CheckEvenOdd;

import java.util.Scanner;


public class ProgramToCheckEvenOrOddIntegers {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number to check =");
        int num = sc.nextInt();
        
        if(num % 2 == 0 )
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }
        
    }
    
}
