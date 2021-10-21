package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv6_함수 {
	public static void main(String[] args) throws IOException {
		quiz3();
	}
	
	public static void quiz1() throws NumberFormatException, IOException {
		class Test{
			long sum(int[] a) {
				long ans = 0;
				for(int i=0; i < a.length; i++) {
					ans += a[i];
				}
				return ans;
			}
		}
	}
	
	public static void quiz2() {
		class Test{
			void d(int num) {
				int [] selfArr = new int[num];
				int [] calArr = new int[num];
				
				//selfArr 초기화
				for (int i : selfArr) {
					selfArr[i] = 0;
				}
				for(int i=1; i<=num; i++) {
					calArr[i-1] = i;
				}
				for(int i=1; i<num; i++) {
					String strNum = Integer.toString(i);
					int sum = i;
					for(int j=0; j<strNum.length(); j++) {
						sum += Character.getNumericValue(strNum.charAt(j));
					}
					if(sum <= num) {
						selfArr[sum-1] = sum;
					}
				}
				for(int k=0; k<calArr.length; k++) {
					if(selfArr[k] != calArr[k]) {
						System.out.println(calArr[k]);
					}
				}
			}
		}
		Test test = new Test();
		test.d(10000);
	}
	
	public static void quiz3() throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		int temp = Integer.parseInt(br.readLine());
		int cnt = 0;
		String strCnt = "";
		for(int i=1; i<temp; i++) {
			if(i <= 99) {
				cnt++;
			}
			else {
				strCnt = Integer.toString(i);
				for(int j=0; j<strCnt.length();j++) {
					System.out.println(j);
				}
			}
		}
	}
	
	
}
