package ¹®ÀÚ¿­;

import java.util.*;

//https://www.acmicpc.net/problem/1100
public class ÇÏ¾áÄ­ {
//ÇÏ¾áÄ­ Â¦¼ö // °ËÁ¤Ä­ È¦¼ö  8x8
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		for(int i=0; i<8;i++) {
			String str = sc.nextLine();
			for(int j=0; j<8;j++) {
				if((i%2==0 && j%2==0) ||(i%2==1 && j%2==1)) {
					if(str.charAt(j)=='F') {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}

