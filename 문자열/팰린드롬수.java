package ���ڿ�;
import java.util.*;

//https://www.acmicpc.net/problem/1259
//�յڷ� �о����� �Ȱ��̴ٸ� �Ӹ�����̶�� ����
public class �Ӹ���Ҽ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equals("0"))break;
			int length = str.length();
			
			boolean check = true;
			for (int i = 0; i < length - 1 / 2; i++) {
				if (str.charAt(i) != str.charAt((length - 1) - i)) {
					check = false;
					break;
				}
			}
			System.out.println(check?"yes":"no");
		}
		
		
	}

}
