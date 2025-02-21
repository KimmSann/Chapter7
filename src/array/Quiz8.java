package array;

public class Quiz8 {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student(1001, "kim");
		student[1] = new Student(1002, "cho");
		student[2] = new Student(1003, "park");
		
		for(int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}
	}

}

class Student{
	int studentHakbun;
	String studentName;
	public Student(int studnetHakbun, String studentName) {
		super();
		this.studentHakbun = studnetHakbun;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println(studentHakbun + "," + studentName);
	}
}