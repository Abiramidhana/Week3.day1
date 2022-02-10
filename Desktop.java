package system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("This is size no 5");
	}

	public static void main(String[] args) {
		Desktop d= new Desktop();
		d.ComputerModel();
		d.desktopSize();
		

	}

}
