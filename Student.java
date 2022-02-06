package student;

import college.College;
import department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Abirami");
	}
public void studentDept()
{
	System.out.println("CSE");
}
public void studentId()
{
	System.out.println(101);
}
	public static void main(String[] args) {
	College c=new College();
	Department d= new Department();
	Student s= new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	s.collegeCode();
	s.collegeName();
	c.collegeRank();
	d.deptName();

	}

}
