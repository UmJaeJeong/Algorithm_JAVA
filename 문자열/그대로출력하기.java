package ���ڿ�;

import java.util.*;
//Scanner�� �Է� �޾����� nextLine�̳� next�Լ��ν�� ������ ���� ���߽��ϴ�.
//�׷��� hasNextLine()�Լ��� ���� �Էµ����Ͱ� �ִ��� ���η� Ȯ���մϴ�.

//EOF��? End Of File=> ���̻� ���� �����Ͱ� �����Ƿ� ���̶�°��� �ǹ�

//hasNextLine() ������ ���� ���� �ִ��� Ȯ���ϴ� booleanŸ���� �Լ�
//NextLine()�� �� ������ ���� �о� ���� �Լ� / �� ������ �ƴ� �ܾ� ������ �ϰ� ������ Next()�� ����Ѵ�.
//https://www.acmicpc.net/problem/11718
public class �״������ϱ� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData ="";
		while(sc.hasNextLine()) {
			inputData = sc.nextLine();
			System.out.println(inputData );
		}
	}

}
