package Anandsir;
class Parent
{
	int j =45;
	void run()
	{
		System.out.println("i m in parent class");
	}
	}
class Child extends Parent
{
	int j= 56;
	void run2()
	{
		System.out.println("i m in child class");
	}
	}

public class Anandsir {

	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.run();
		System.out.println(p1.j);
			}

}
