package ���ڿ�;

import java.util.*;

//https://www.acmicpc.net/problem/10808
public class ���ĺ����� {
	private static int[] alphabetCnt = new int[26]; // ���ĺ� ������ �� 26�� �̹Ƿ�
	
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
		
		//String �ҹ��� = inputData.toLowerCase();
		//String �빮�� = inputData.toUpperCase();
	}

}
