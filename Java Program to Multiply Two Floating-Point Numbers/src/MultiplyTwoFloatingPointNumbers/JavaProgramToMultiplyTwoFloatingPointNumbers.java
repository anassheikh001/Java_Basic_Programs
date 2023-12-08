
package MultiplyTwoFloatingPointNumbers;

import java.util.Scanner;


public class JavaProgramToMultiplyTwoFloatingPointNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Floating Point number =");
        float f1 = sc.nextFloat();
        
        System.out.println("Enter Second Floating Point number =");
        float f2 = sc.nextFloat();
        
        
       float result = f1*f2;
       
       System.out.println("Result =" +result);
    }
    
}
