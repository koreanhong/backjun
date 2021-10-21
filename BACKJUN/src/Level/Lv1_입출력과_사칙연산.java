package Level;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Lv1_입출력과_사칙연산 {

	public static void main(String[] args) {
		quiz11();
	}
	
	public static void quiz1() {
		System.out.println("Hello World");
	}
	public static void quiz2() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	public static void quiz3() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	public static void quiz4() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	public static void quiz5() {
		int A ,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("A + B = " + (A+B));
	}
	public static void quiz6() {
		int A ,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("A - B = " + (A-B));
	}
	public static void quiz7() {
		int A ,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("A x B = " + (A*B));
	}
	public static void quiz8() {
		double A ,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("A / B = " + (A/B));
	}
	public static void quiz9() {
		int A ,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("A + B = " + (A+B));
		System.out.println("A - B = " + (A-B));
		System.out.println("A x B = " + (A*B));
		System.out.println("A / B = " + (A/B));
		System.out.println("A % B = " + (A%B));
	}
	public static void quiz10() {
		int A,B,C;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		System.out.println("C를 입력하시오.");
		C = scan.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
	public static void quiz11() {
		int A,B,B1,B2,B3;
		Scanner scan = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		A = scan.nextInt();
		System.out.println("B를 입력하시오.");
		B = scan.nextInt();
		B1 = B % 10;
		B2 = (B % 100)/10;
		B3 = (B / 100);
		
		System.out.println(A*B1);
		System.out.println(A*B2);
		System.out.println(A*B3);
		System.out.println(A*B);
	}
}

