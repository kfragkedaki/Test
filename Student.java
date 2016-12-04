import java.util.ArrayList;

public class Student {
	private String am;
	private String name;
	private static ArrayList<Student> students=new ArrayList<Student>();

	public Student(String sAm,String sName) {
		am=sAm;
		name=sName;
		students.add(this);
	}

	public void setAm(String sAm) {
		am=sAm;
	}
	public void setName(String sName) {
		name=sName;
	}
	public String getAm() {
		return am;
	}
	public String getName() {
		return name;
	}
 	public String toString() {
		return "AM:" +am + "\n" + "Name:" +name + "\n";
	}
	public static String findStudentData(String stdam) {
		int i=0,f=0;
		while (i<students.size()) {
			if (students.get(i).getAm().equals(stdam)) {
				f=1;
			}
  			i=i+1;
		}
   		if (f==0) return "Sorry the Student with AM: «όρισμα» is not registered in our database";
   		else return students.get(i).toString();
	}
	public static void deleteStudent(String stdam) {
		int i=0,f=0;
		while (i<students.size()) {
			if (students.get(i).getAm().equals(stdam)) {
    			students.remove(i);
     			 f=1;
     			 }
		i=i+1;
		}
		if (f==0) System.out.println("Sorry the Student with AM: «όρισμα» is not registered in our database");
	}
	public static void printStudents() {
		if (students.size()==0) System.out.println("No Students have been registered yet!");
		else
			for (int i=0;i<students.size();i++) System.out.println(students.get(i));
		}
}


