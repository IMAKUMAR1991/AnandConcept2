package Anandsir;
class Emp{
	int age;int reg; String name;
	public  Emp(int age,int reg, String name){
		this.age= age;
		this.reg= reg;
		this.name = name;
		}
	public void display(){
		System.out.println(age);
		System.out.println(reg);
		System.out.println(name);
	}}
class Testengineer extends Emp{
	String type;
	public  Testengineer(int age,int reg, String name,String type){
	super( age,reg,name);
	this.type = type;
	}
	public void display(){
		System.out.println("************");
	    super.display();
		System.out.println(type);
	}}
	class Developer extends Emp{
	String lang ;
	public Developer(int age,int reg, String name,String lang){
		super(age,reg,name);
		this.lang=lang;
		}
	public void display(){
		System.out.println("************");
		super.display();
		System.out.println(lang);
}}
public class Polymorphism_ {
public static void main(String[] args) {
	    Testengineer te1= new Testengineer(23, 121, "Anand", "Selenium");
	    te1.display();
	    Developer de1= new Developer(16, 1212, "abhi", "Java");
     	de1.display();
	}
}
