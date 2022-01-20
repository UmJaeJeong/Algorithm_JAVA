package 문자열;
import java.util.*;
//https://www.acmicpc.net/problem/1427
public class 소트인사이드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		String input= sc.nextLine();
		
		for(int i=0; i<input.length();i++) {
			list.add(input.charAt(i)-'0');
		}
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}

	}

}

//ArrayList의 크기를 확인하는 함수는 size()이다
