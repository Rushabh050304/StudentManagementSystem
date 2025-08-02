
public class University {

	public static void main(String[] args) {
College c = new College();
Student st =c.getStudentDetails();
System.out.println(st.name+" "+st.rollNo+" "+st.address);

AllStudent a =c.addAllStudent();

System.out.println("---ALL STUDENT---");
System.out.println(a.a1.rollNo+" "+a.a1.name+" "+a.a1.address);
System.out.println(a.a2.rollNo+" "+a.a2.name+" "+a.a2.address);
System.out.println(a.a3.rollNo+" "+a.a3.name+" "+a.a3.address);
	}
}
