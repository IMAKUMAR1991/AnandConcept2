package Anandsir;

public class AnandString3 {

	public static void main(String[] args) {
		String s1 = "Ramson";
		String s2 = "kumArAra";
		String s3 = "KUMarARa";
		String s6= "     My name is     anand kumar        ";
	String s4 =	s1.concat(s2);
	System.out.println(s4);
    String s5=s2.toUpperCase();
    System.out.println(s5);
    System.out.println(s2.toLowerCase());
    System.out.println(s1.codePointAt(3));  // what is this
    System.out.println(s1.endsWith("n"));
    ///// index of
    System.out.println(s1.indexOf("m"));
    System.out.println(s2.indexOf("A"));
    System.out.println(s3.equalsIgnoreCase(s2));
    System.out.println(s6.trim());// removes the of String from start n end
    	}
}
