package abstraction;

interface Vaibhav{
	
	void add();
	void sum();
	
	default void display() {
		System.out.println("display");
	}
	
	
}
public class Main implements Vaibhav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj = new Main();
		obj.add();
		obj.sum();
		obj.display();
		

	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sum() {
System.out.println("sub");
		
	}

}
