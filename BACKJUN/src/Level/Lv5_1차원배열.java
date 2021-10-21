package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Lv5_1차원배열 {
	public static void main(String[] args) throws IOException {
		quiz1();
	}
	
	public static void quiz1() throws NumberFormatException, IOException {
		int max,min;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(bf.readLine())];
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		max = arr[arr.length-1];
		min = arr[0];
		System.out.println(min + " " + max);
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
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(bf.read() % 42);
		}
        
		System.out.print(h.size());
	}
	public static void quiz4_1() throws NumberFormatException, IOException {
		boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
	}
	public static void quiz5() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M,N;
		int av = 0;
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		double[] arr2  = new double[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//최댓값
		M =  arr[0];
		for(int i=0; i<arr.length; i++) {
			if(M < arr[i]) {
				M =  arr[i];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (Math.round((arr[i]/(double)M) * 100)*100)/100;
		}
		
		
		for(int i=0; i<arr2.length; i++) {
			av += arr2[i];
		}
		System.out.println(av/(double)arr2.length);
	}
	
	public static void quiz5_1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		double arr[] = new double[Integer.parseInt(br.readLine())];
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		
		Arrays.sort(arr);
		for (double d : arr) {
			System.out.println(d);
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += ( (arr[i] / arr[arr.length-1])*100 );
		}
		System.out.print( sum/arr.length );
	}
	
	public static void quiz6() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = new String[Integer.parseInt(br.readLine())];
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = br.readLine();
		}
		
		for(int i=0; i<strArr.length; i++) {
			int tot = 0,cnt = 0;
			for(int j=0; j<strArr[i].length(); j++) {
				if(strArr[i].charAt(j) == 'O') {
					cnt += 1;
					tot += cnt;
				}else if(strArr[i].charAt(j) == 'X') {
					cnt = 0;
				}
			}
			System.out.println(tot);
		}
		
	}
	
	public static void quiz7() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = null;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while (st.hasMoreTokens()) {
				int sum = 0,av = 0, cnt = 0;
				arr = new int[Integer.parseInt(st.nextToken())];
				for(int j =0; j<=arr.length-1; j++) {
					arr[j] = Integer.parseInt(st.nextToken());
					sum += arr[j];
				}
				av = sum/arr.length;
				for(int k=0; k<=arr.length-1; k++) {
					if(arr[k] > av) {
						cnt++;
					}
				}
				double result = (cnt/(double)arr.length) * 100;
				System.out.println(String.format("%.3f",result) + "%");
			}
		}
		
	}
	public static void quiz7_1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < testcase ; i++) {
 
			st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
			
			
			int N = Integer.parseInt(st.nextToken());	//학생 수 
			arr = new int[N];
			
			
			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < N ; j++) {
				int val = Integer.parseInt(st.nextToken());	// 성적 저장
				arr[j] = val;
				sum += val;	// 성적 누적 합 
			}
			
			double mean = (sum / N) ;
			double count = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
	
		}
	}
	
}
