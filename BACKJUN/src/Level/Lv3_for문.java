package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Lv3_for문 {
	public static void main(String[] args) throws IOException {
		quiz11();
	}
	
	public static void quiz1() {
		int N;
		Scanner scan = new Scanner(System.in);
		System.out.println("N을 입력");
		N = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N  + "*" + i + "=" + N*i);
		}
	}
	public static void quiz2() {
		int A,B,T;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for(int i=1; i<=T; i++) {
			System.out.println("A입력");
			A = scan.nextInt();
			System.out.println("B입력");
			B = scan.nextInt();
			System.out.println(A+B);
		}
	}
	public static void quiz3() {
		int N = 0;
		int tot = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		for(int i=1; i<=N; i++) {
			tot = tot + i;
		}
		System.out.println(tot);
	}
	public static void quiz4() throws IOException {
		int T = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("테스트 케이스 입력");
		T = Integer.parseInt(bf.readLine());
		for(int i=1; i<=T; i++) {
			int A,B;
			System.out.println("A입력");
			A = Integer.parseInt(bf.readLine());
			System.out.println("B입력");
			B = Integer.parseInt(bf.readLine());
			System.out.println(A+B);
		}
	}
	public static void quiz5() throws IOException {
		int N = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("자연수입력");
		N = Integer.parseInt(bf.readLine());
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}
	public static void quiz6() throws IOException {
		int N = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("자연수입력");
		N = Integer.parseInt(bf.readLine());
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}
	}
	public static void quiz7() throws IOException {
		int T = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("테스트 케이스 입력");
		T = Integer.parseInt(bf.readLine());
		for(int i=1; i<=T; i++) {
			int A,B;
			System.out.println("A입력");
			A = Integer.parseInt(bf.readLine());
			System.out.println("B입력");
			B = Integer.parseInt(bf.readLine());
			System.out.println("Case #"+i+":"+ (A+B));
		}
	}
	public static void quiz8() throws IOException {
		int T,x,C,A,B;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("테스트 케이스 입력");
		T = Integer.parseInt(bf.readLine());
		
		for(int i=1; i<=T; i++) {
			System.out.println("A입력");
			A =  Integer.parseInt(bf.readLine());
			System.out.println("B입력");
			B =  Integer.parseInt(bf.readLine());
			C = A + B;
			System.out.println("Case #"+ i + ": " + A + " + " + B + " = " + C);
		}
	}
	public static void quiz9() throws IOException {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void quiz10() throws IOException {
		for(int i=0; i<=4; i++) {
			for(int j=4; j>=i+1; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void quiz11() throws IOException {
		int N = 0,X = 0;
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("N입력");
		N = Integer.parseInt(bf.readLine());
		System.out.println("X입력");
		X = Integer.parseInt(bf.readLine());
		int[] A = new int[N];
		for(int i=0; i< N; i++) {
			System.out.println(i+1 + "번째 숫자 입력");
			A[i] = Integer.parseInt(bf.readLine());
		}
		for(int i=0; i<=9; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}

	}
}
