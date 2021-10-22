package reseult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
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
