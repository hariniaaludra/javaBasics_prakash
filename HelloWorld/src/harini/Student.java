package harini;

public class Student {
	String studentname;
	int studentRollno;
	Student(){	
		studentname = "soo";
		studentRollno = 113;
	}
	
	public void display() {
		System.out.println("Student Details:"+ studentname);
		
	}
	Student(int studentRollno, String studentname){
		this.studentname=studentname;
		this.studentRollno=studentRollno;
		
	}
public static void main(String[] args) {
	Student c=new Student();
	Student c1=new Student(1123,"kajal");
	c.display();
	c1.display();

}
}
