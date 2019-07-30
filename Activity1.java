import java.util.*;

	public class Activity1 {
    
    	public static void main(String[] args) {
  		int num1;
 		int num2;
 		int sum;
 		int dif;
 		int prod;
 		int quot;
 		int res;
 		
  		Scanner input = new Scanner(System.in);	
    		
    	
    		System.out.println("Enter number 1");
    		num1 = input.nextInt();
    		
    		System.out.println("Enter number 2");
    		num2 = input.nextInt();
    		
    			sum = num1 + num2;
    			dif = num1 - num2;
    			prod = num1 * num2;
    			quot = num1 / num2;
    				
    				res = num1 + num2;
    				System.out.println("The sum of" + res);
    				
    				res = num1 - num2;
    				System.out.println("The difference of" + res);
    				
    				res = num1 * num2;
    				System.out.println("The product of" + res);
    				
    				res = num1 / num2;
    				System.out.println("The quotient of" + res);
    				
    		
    
    }
}
