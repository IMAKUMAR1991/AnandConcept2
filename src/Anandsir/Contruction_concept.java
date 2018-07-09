package Anandsir;
 class Ract
{
	 int l; int b; String s;
	public  Ract(int l, int b)
	 {
		this.l =l;
		this.b=b;
		this.s=s;
		 System.out.println (l+"   " +b);
	 }
	public Ract(int l, int b, String s){
	System.out.println(l+"   " +b+"     "+s);
		
	}
	}

public class Contruction_concept {

	public static void main(String[] args) {
	Ract r1= new Ract(23,25);
	Ract r2 = new Ract(27,28,"White");
	
	}

}
