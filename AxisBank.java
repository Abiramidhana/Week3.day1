package sample;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("The deposited amount is :240000");
	}

	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
		
	}

}
