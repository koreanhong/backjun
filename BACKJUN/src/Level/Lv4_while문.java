package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Lv4_while문 {
	public static void main(String[] args) throws IOException {
		quiz3();
	}
	
	public static void quiz1() throws NumberFormatException, IOException {
		int A,B;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("A입력");
			A = Integer.parseInt(bf.readLine());
			System.out.println("B입력");
			B = Integer.parseInt(bf.readLine());
			
			if(A == 0 && B == 0) {
				break;
			}else {
				System.out.println(A+B);
			}
		}
		
	}
	public static void quiz2() throws NumberFormatException, IOException {
		int A,clonA,cnt = 1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A입력");
		A = Integer.parseInt(bf.readLine());
		clonA = A;
		while (true) {
			if(A < 10) {
				A = A * 10;
			}
			int i,j,result,result_,A_;
			String Z;
			
			i = A / 10; //1의 자리
//			System.out.println(i);
			j = A % 10; //10의 자리
//			System.out.println(j);
			result = i + j; // i+j
//			System.out.println(result);
			A_ = A % 10; //A의 10의자리
//			System.out.println(A_);
			result_ = result % 10; //result의 10자리수
//			System.out.println(result_);
			A = Integer.parseInt((Integer.toString(A_) + Integer.toString(result_)));
			System.out.println((Integer.toString(A_) + Integer.toString(result_)));
//			System.out.println("A==" + A);
			
			break;
//			if(A == clonA) {
//				break;
//			}
//			cnt++;
//			if(cnt == 4) {
//				break;
//			}
		}
		System.out.println("cnt== " + cnt );
		
	}
	public static void quiz3() throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int temp = n;
		int count = 0;
		
		while(true) {
			int left = temp / 10;
			int right = temp % 10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if(n == temp) {
				break;
			}
		}
		
		System.out.println(count);
	}
	
}
