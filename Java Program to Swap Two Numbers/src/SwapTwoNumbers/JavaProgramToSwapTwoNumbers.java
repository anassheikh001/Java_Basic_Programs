
package SwapTwoNumbers;


public class JavaProgramToSwapTwoNumbers {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=10;
        int b=20;
        
        System.out.println("Before Swapping value of A is =" + a +"\nBefore Swapping value of B is =" +b);
          //SwappingWithThirdVariable

//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swapping value of A is =" + a +"\nAfter Swapping value of B is =" +b);
      

        //SwappingWithoutThirdVariable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("=====================");
        System.out.println("After Swapping value of A is =" + a +"\nAfter Swapping value of B is =" +b);
        
    }
    
}
