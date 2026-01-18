package imp_questions_java_programing;

public class A20 {

	//Sum of digits of a given number

	    public static void main(String[] args) {
	        int number = 12345;  // hardcoded number
	        int sum = 0;
	        int temp = number;
	        
	        while (temp > 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }
	        
	        System.out.println("Sum of digits of " + number + " is " + sum);
	    }
	}
