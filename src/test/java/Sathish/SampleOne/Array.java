package Sathish.SampleOne;

public class Array {
public static void main(String[] args) {
	int num[] = new int[5];
	num[0] = 10;
	num[1] = 40;
	num[2] = 50;
	num[3] = 80;
	num[4] = 30;
	for (int i = 0; i < num.length; i++) {
		System.out.println(i);
	}
	System.out.println("Length:" + num.length);
	}
}
