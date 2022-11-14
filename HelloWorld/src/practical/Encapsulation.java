package practical;

public class Encapsulation {
	private int rollNo=10;
	private String name;
	public int getRollno() {
		return rollNo;
	}
	public void setRollno(int rollno) {
		this.rollNo = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public static void main(String[] args) {
		
	Encapsulation student=new Encapsulation();

	System.out.println(student. getRollno());
	student.setName("Prakash");
	System.out.println(student.getName());
	student.setRollno(383);
	System.out.println(student. getRollno());

}
}