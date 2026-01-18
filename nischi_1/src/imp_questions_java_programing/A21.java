package imp_questions_java_programing;

public class A21 {


	// Count of digits in a given number

	    public static void main(String[] args) {
	        int number = 12345;  // hardcoded number
	        int count = 0;
	        int temp = number;
	        
	        while (temp > 0) {
	            count++;
	            temp /= 10;
	        }
	        
	        System.out.println("Count of digits in " + number + " is " + count);
	    }
	}
