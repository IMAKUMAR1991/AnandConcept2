package Anandsir;
class Family1
{
	String name; String role; String occ;int age;
	public Family1(String name, String role, int age)
	{
		this.name = name;
		this.role = role;
		this.age= age;
		System.out.println("Super Family");
	}
	public Family1(String name, String role, String occ,int age)
	{
	   this(name,role,age);
		this.occ=occ;
	}
	public void disply()
	{
		System.out.println("*****************");
		System.out.println(name);
		System.out.println(role);
		System.out.println(occ);
		System.out.println(age);
		System.out.println("___________________");
	}
	
	}
	
public class Family {

	public static void main(String[] args) 
	{
		Family1 rv1 = new Family1("anand","bro",32);
		Family1 rv2 = new Family1("anand2","bro1",32);
		Family1 rv3= new Family1("anand2","bro1","doctor",32);
		
		rv1.disply();
		rv2.disply();
		rv3.disply();
		
	}

}
