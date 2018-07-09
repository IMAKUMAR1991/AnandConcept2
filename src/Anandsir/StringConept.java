package Anandsir;

public class StringConept {
	public static void main(String[] args) {
		String s1= "anand"; String S2="";
		int j= s1.length()-1;
		System.out.println(j);
    /*   for(int i=s1.length()-1; i>=0; i--)
      {
		char ch=s1.charAt(i);
		S2= S2+ch;
      }
	System.out.println(S2); */
		
		
		while(j>=0)
		{
			char ch = s1.charAt(j);
			S2= S2+ch;
			j--;
			System.out.println(S2);
			
		}
		System.out.println(S2);

	}
	

}
