package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv5_1차원배열 {
	public static void main(String[] args) throws IOException {
		quiz4();
	}
	
	public static void quiz1() throws NumberFormatException, IOException {
		int N,max,min;
		String strArr;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("N입력");
		N = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[N];
		System.out.println("arr입력");
		strArr = bf.readLine();
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(strArr.split(" ")[i]);
		}
		
		max = arr[0];
		min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min +" " + max);
		
		
		
	}
	
	public static void quiz2() throws NumberFormatException, IOException {
		int[] arr = new int[9];
		int max, point = 0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<=8; i++) {
			System.out.println(i+1+"번쨰 숫자입력");
			arr[i] = Integer.parseInt(bf.readLine());
		}
		for (int i : arr) {
		}
		max = arr[0];
		for(int i=0; i<=arr.length - 1; i++) {
			if(max < arr[i]) {
				max = arr[i];
				point = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(point);
	}
	
	public static void quiz3() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A,B,C,result =0;
		int[] arr = new int[10];
		String strResult = "";
		
		System.out.println("A입력");
		A = Integer.parseInt(bf.readLine());
		System.out.println("B입력");
		B = Integer.parseInt(bf.readLine());
		System.out.println("C입력");
		C = Integer.parseInt(bf.readLine());
		
		result = A*B*C;
		strResult = Integer.toString(result);
		
		for(int i=0; i<strResult.length(); i++) {
			arr[i] = 0; 
		}
		
		for(int i=0; i<strResult.length(); i++) {
			arr[Character.getNumericValue(strResult.charAt(i))] ++;		
		}
		
		for (int i : arr) {
			System.out.println(i);
		}	
	}
	public static void quiz4() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int temp, cnt = 0;
		
		for(int i=0; i<=arr1.length-1; i++) {
			arr1[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i=0; i<=arr1.length-1; i++) {
			temp = arr1[i]%42;
			arr2[i] = temp;
			for(int j=0; j<=i; j++) {
				if(arr2[j] == temp) {
					cnt++;
				}
			}
		}
//		System.out.println(cnt);
//		for (int i : arr2) {
//			System.out.println(i);
//		}
//		System.out.println(cnt);
		
		
		
	}
	
}
