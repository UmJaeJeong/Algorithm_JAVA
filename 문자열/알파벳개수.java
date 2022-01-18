package 문자열;

import java.util.*;

//https://www.acmicpc.net/problem/10808
public class 알파벳개수 {
	private static int[] alphabetCnt = new int[26]; // 알파벳 갯수가 총 26개 이므로
	
	private static String inputData;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inputData = sc.nextLine();
		
		for(int i=0; i<inputData.length();i++) {
			alphabetCnt[inputData.charAt(i)-'a']++;
		}
		
		for(int i=0; i<26;i++) {
			System.out.print(alphabetCnt[i]+" ");
		}
		
		//String 소문자 = inputData.toLowerCase();
		//String 대문자 = inputData.toUpperCase();
	}

}
