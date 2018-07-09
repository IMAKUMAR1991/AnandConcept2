package Anandsir;
class Parent1 {
	int j =60;
	void run(){
	System.out.println("i m in parent class");
	}
}
class Child1 extends Parent1{
	int j =50;
	void wish()
	{
		System.out.println("i m in child class");
	}
}
public class Anandsir1 {

	public static void main(String[] args) {
		// upcasting
		Parent1 obj = new Child1();
		obj.run();
		
		//downcasting
		Child1 obj2 = (Child1)obj;
		obj.run();
		obj2.wish();
		obj2.run();
		System.out.println(obj2.j);
		
		

	}

}
