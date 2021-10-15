package Level;

import java.util.Scanner;

public class Lv2_if문 {
	public static void main(String[] args) {
//		quiz1();
//		quiz2();
//		quiz3();
		quiz4();
	}
	
	public static void quiz1() {
		int A,B;
		Scanner scan = new Scanner(System.in);
		System.out.println("A입력");
		A = scan.nextInt();
		System.out.println("B입력");
		B = scan.nextInt();
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
	}
	public static void quiz2() {
		int A;
		Scanner scan = new Scanner(System.in);
		System.out.println("A입력");
		A = scan.nextInt();
		if(A > 90 && A <= 100 ) {
			System.out.println("A");
		}else if(A < 89 && A >= 80) {
			System.out.println("B");
		}else if(A < 79 && A >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}
	public static void quiz3() {
		int A;
		Scanner scan = new Scanner(System.in);
		System.out.println("A입력");
		A = scan.nextInt();
		if((A%4 == 0) && ((A%100 != 0 )|| (A%400 == 0))) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	public static void quiz4() {
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("x입력");
		x = scan.nextInt();
		System.out.println("y입력");
		y = scan.nextInt();
		
		if(x >= 0 && y >= 0) {
			System.out.println("1");
		}else if(x < 0 && y >= 0 ) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}
	}
	public static void quiz5() {
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("x입력");
		x = scan.nextInt();
		System.out.println("y입력");
		y = scan.nextInt();
		
		if(x >= 0 && y >= 0) {
			System.out.println("1");
		}else if(x < 0 && y >= 0 ) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}
		
	}
}
