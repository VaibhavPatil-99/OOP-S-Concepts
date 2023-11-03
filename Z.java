package inheritance;

 class C {
	
	C() {
		System.out.print("z constructor");
		}

	int x=12;
	static int t=1;
	
	void m()
	{
		int num = 66;
		System.out.println("calling from z class");
	}
}

class A extends C {
	 
	A() {
		super();
		System.out.println("A constructor");
		
	}
	
	void display() {
		System.out.println("hello from class A");
	}
}

class B extends C
{
	B(){
		System.out.println("b constructor");
		}
	
	void showMessage() {
		System.out.println("hello from class B");
	}
}

public class Z {
	public static void main(String[] args) {
		B b= new B();
		System.out.println(b.x + " "+ C.t);
		b.m();
		b.showMessage();
		
		A a = new A();
		System.out.println(a.x + " " + C.t);
		a.m();
		a.display();
	}
	
	
}

