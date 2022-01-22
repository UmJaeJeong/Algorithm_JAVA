package ¹®ÀÚ¿­;
import java.util.*;

//https://www.acmicpc.net/problem/5430
public class AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<T;i++) {
			
		}
	}
	
	public static int[] reverse(int[] valuse) {
		int[] temp = new int[valuse.length];
		for(int i=0; i<valuse.length;i++) {
			temp[i] = valuse[valuse.length-1-i];
		}
		
		return temp;
	}
	
	public static int[] delete(int[] valuse) {
		int[] temp = new int[valuse.length-1];
		for(int i=1; i<valuse.length;i++) {
			temp[i-1] = valuse[i];
		}
		
		return temp;
	}

}
