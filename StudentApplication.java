import java.util.Scanner;

public class  StudentApplication {
	public void main(String[] args) {
		String stdam;
		String stdname;
		do {
			Student firststudent=new Student("11111111","Jim Moris");
			Student secondstudent=new Student("22222222","Tom Burn");
			System.out.println("--- MENU ---\n1.Print all Students\n2.Insert new Student\n3.Find a Student\n4.Delete a Student\n5.Exit Program\n---------------");
			Scanner input=new Scanner(System.in);
			int x=input.nextInt();
			if (x==1) Student.printStudents();
			else if (x==2) {
 				System.out.println("Πρόσθεσε το AM: " );
				stdam=Student.getAm();
				System.out.println("Πρόσθεσε το όνομα του μαθητή:");
				stdname=Student.getName();
				Student student=new Student(stdam,stdname);
			}
		 	else if (x==3) {
				System.out.println("Πρόσθεσε το AM: " );
				stdam=Student.getAm();
				Student.findStudentData(stdam);
			}
			else if (x==4) {
				System.out.println("Πρόσθεσε το AM: " );
				stdam=Student.getAm();
				Student.deleteStudent(stdam);
			}
			else break;
			}
		while (x!=5);
	}
}