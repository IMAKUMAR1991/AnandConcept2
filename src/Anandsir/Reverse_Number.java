package Anandsir;

public class Reverse_Number {

	public static void main(String[] args) {
	int num = 1100023001;  int reverse=0; int reverse2;
	while(num>0)
	{
		reverse2 = num%10;
		reverse= reverse*10+reverse2;
		num = num/10;
	  }
	System.out.println(reverse);

	}

}
