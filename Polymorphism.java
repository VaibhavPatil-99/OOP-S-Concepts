package polymorphism;

class A {
	void display()
	{
		System.out.println("hello gm...");
	}
	
	void display(int a)
	{
		System.out.println(a);
	}
	
	void display(int a, int b)
	{
		System.out.println(a+ " " + b);
	}
	
	void display(String a,int b)
	{
		System.out.println(a + " " + b);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.display();
		a.display(30);
		a.display(10, 20);
		a.display("priya", 50);
	}

}
