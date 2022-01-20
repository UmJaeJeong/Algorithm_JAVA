package ¹®ÀÚ¿­;
import java.util.*;
//https://www.acmicpc.net/problem/10953
public class AB6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			String str = sc.nextLine();
			System.out.println(str);
			System.out.println(str.charAt(0)-'0'+str.charAt(2)-'0');
		}
		

	}

}
