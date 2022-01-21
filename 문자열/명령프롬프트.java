package 문자열;
import java.util.*;
public class 명령프롬프트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int N = sc.nextInt();
		sc.nextLine();
		String str="";
		for(int i=0; i<N;i++) {
			str = sc.nextLine();
			list.add(str);
		}
		
		int length = str.length();
		String answer = "";
		String first = list.get(0);
		for(int i=0; i<length;i++) {
			boolean check = true;
			for(int j=1; j<list.size();j++) {
				if(list.get(0).charAt(i) != list.get(j).charAt(i)) {
					check = false;
					break;
				}
			}
			
			if(check) {
				answer+=list.get(0).charAt(i);
			}else {
				answer+="?";
			}
		}
		
		System.out.println(answer);
		
	}
}
