package ���ڿ�;
import java.util.*;
//https://www.acmicpc.net/problem/1764
public class �躸�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String>list = new ArrayList<>();
		ArrayList<String>answer = new ArrayList<>();
		for(int i=0; i<N+M;i++) {
			String str = sc.nextLine();
			list.add(str);
		}
		
		//��������
		Collections.sort(list);
		//��������
		//Collections.sort(list,Comparator.reverseOrder());
		for(int i=1; i<list.size();i++) {
			String str1 = list.get(i-1);
			String str2 = list.get(i);
			
			if(str1.equals(str2))answer.add(str1);
		}
		
		System.out.println(answer.size());
		for(int i=0; i<answer.size();i++) {
			System.out.println(answer.get(i));
		}
	}

}

