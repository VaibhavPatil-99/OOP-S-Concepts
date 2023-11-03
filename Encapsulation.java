package encapsulation;

class student {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s = new student();
		s.setName("vaibhav");
		s.setId(10);
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

}
