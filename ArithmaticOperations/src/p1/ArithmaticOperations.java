package p1;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub = subtractNumbers(20, 5);
		System.out.println(sub);

		int mul= multiplyNumbers(4, 5);
		System.out.println(mul);
		double div =divideNumbers(22, 7);
		System.out.printf("%.2f\n", div);
		int rem = findRemainder(10, 3);
		System.out.println(rem);
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
		
	}

	public static double divideNumbers(int num1, int num2) {
		double c =(double)num1/num2;
		return c;
		
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
		
	}

}
