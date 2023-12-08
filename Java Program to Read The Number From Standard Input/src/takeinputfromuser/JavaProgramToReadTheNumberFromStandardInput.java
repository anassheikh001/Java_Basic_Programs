
package takeinputfromuser;

import java.util.Scanner;


public class JavaProgramToReadTheNumberFromStandardInput {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer =");
        
        int num = sc.nextInt();
        
         System.out.println("Entered Integer is =" +num);
    }
    
}
