package student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Id No is :" +id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Id No is :" +id);
		System.out.println("Name is :" +name);
	}
	public void getStudentInfo(String email,long ph_no)
	{
		System.out.println("Email is :"+email);
		System.out.println("Ph no is :"+ph_no);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(101);
		stud.getStudentInfo(102, "Abirami");
		stud.getStudentInfo("abc@gmail.com", 123456789l);

	}

}
