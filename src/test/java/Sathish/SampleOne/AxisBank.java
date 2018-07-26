package Sathish.SampleOne;

public class AxisBank extends Bank {
@Override
public void SavingAct() {
	System.out.println("5%");
	
}
@Override
	public void CurrentAct() {
		System.out.println("8%");
		
	}
@Override
	public void JoinAct() {
		System.out.println("4%");
		
	}
public static void main(String[] args) {
	AxisBank A = new AxisBank();
	A.SavingAct();
	A.CurrentAct();
	A.JoinAct();
	A.Branch();
}
}
