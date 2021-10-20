package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Lv5_1차원배열 {
	public static void main(String[] args) throws IOException {
		quiz6();
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
	
}
