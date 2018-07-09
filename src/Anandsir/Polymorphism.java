package Anandsir;
interface Car
{
	public void start ();
	public void accelerate();
	public void stop();
	}
class Audi implements Car
{
public void start(){
	System.out.println("start audi");
	}
public void accelerate() {
		System.out.println("accelerate audi");
		}
public void stop() {
		System.out.println("stop audi");
		}}
class Benz implements Car{
	public void start(){
		System.out.println("start audi");
		}
	public void accelerate() {
			System.out.println("accelerate audi");
			}
	public void stop() {
			System.out.println("stop audi");
	}}
    class Driver {
	public void drive(Audi a)
	{
		a.start();
		a.accelerate();
		a.stop();
	}
	public void drive(Benz b)
	{
    b.start();
	b.accelerate();
	b.stop();
			}
	}
public class Polymorphism {
public static void main(String[] args) {
	Driver d1 =new Driver();
	d1.drive(new Audi());
	Benz b = new Benz();
	d1.drive(b);
			}}
