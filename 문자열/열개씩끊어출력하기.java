package 문자열;

import java.util.*;

public class 열개씩끊어출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		int wordLength = inputData.length();
		int cnt = wordLength/10; 
		int mod = wordLength%10;
		
		for(int i=0; i<cnt;i++) {
			System.out.println(inputData.substring(i*10, (i+1)*10));
		}
		System.out.println(inputData.substring(cnt*10));
	}

}
