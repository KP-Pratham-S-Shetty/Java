package p1;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		MessageDecoder m =new MessageDecoder();
		System.out.println(m.decodeCharacter(ch));
		sc.close();

	}

}
