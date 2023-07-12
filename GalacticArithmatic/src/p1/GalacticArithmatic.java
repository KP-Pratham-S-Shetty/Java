package p1;

import java.util.Scanner;

public class GalacticArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		long res =galacticAddition(num1, num2);
		System.out.println(res);
		

	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
