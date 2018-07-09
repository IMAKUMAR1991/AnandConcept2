package Anandsir;

public class Anand_kumr {

	public static void main(String[] args) {
	     int reversed = 0;   int num = 500670001;

	        for( ; num != 0; num /= 10) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	        }

	        System.out.println("Reversed Number: " + reversed);
	    }

	}


