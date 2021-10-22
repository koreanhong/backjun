package Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv7_문자열 {
	public static void main(String[] args) throws IOException {
		quiz5();
	}
	
	public static void quiz1() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((int)bf.readLine().charAt(0));
	}
	
	public static void quiz2() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(bf.readLine());
		int sum = 0;
		String strNum = bf.readLine();
		
		for(int i=0; i<=length- 1; i++) {
			sum += Character.getNumericValue(strNum.charAt(i));
		}
		
		System.out.println(sum);
	}
	
	public static void quiz3() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String S = bf.readLine();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] intArr = new int[26];
		char[] strArr = new char[26];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = -1;
		}
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = alphabet.charAt(i);
		}
		for(int i=0; i<S.length(); i++) {
			for(int j=0; j<strArr.length; j++) {
				if(S.charAt(i) == strArr[j] && intArr[j] == -1 ) {
					intArr[j] = i;
				}
			}
		}
		for (int i : intArr) {
			System.out.print(i + " ");
		}
	}
	public static void quiz4() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int temp = Integer.parseInt(bf.readLine());
		for(int i=0; i<temp; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			while (st.hasMoreTokens()) {
				int z_ = Integer.parseInt(st.nextToken());
				String word = st.nextToken();
				for(int k=0; k<word.length(); k++) {
					for(int z=0; z<z_; z++ ) {
						System.out.print(word.charAt(k));
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void quiz5() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String word = bf.readLine().toLowerCase();
		char tempword = ' ';
		int tempCnt = 0;
		int cnt = 0;
		for(int i=0; i<word.length(); i++) {
			cnt = 0;
			for(int j=0; j<word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt > tempCnt && word.charAt(i) != tempword ) {
				tempCnt = cnt;
				tempword = word.charAt(i);
			}else if(cnt == tempCnt && word.charAt(i) != tempword) {
				tempword = '?';
			}
		}
		System.out.println(Character.toString(tempword).toUpperCase());
	}
	
}
