package 문자열;

import java.util.*;
//Scanner로 입력 받았을떄 nextLine이나 next함수로써는 공백을 받지 못했습니다.
//그래서 hasNextLine()함수로 다음 입력데이터가 있는지 여부로 확인합니다.

//EOF란? End Of File=> 더이상 읽을 데이터가 없으므로 끝이라는것을 의미

//hasNextLine() 다음에 읽을 값이 있는지 확인하는 boolean타입의 함수
//NextLine()은 줄 단위로 값을 읽어 오는 함수 / 줄 단위가 아닌 단어 단위로 하고 싶으면 Next()를 사용한다.
//https://www.acmicpc.net/problem/11718
public class 그대로출력하기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData ="";
		while(sc.hasNextLine()) {
			inputData = sc.nextLine();
			System.out.println(inputData );
		}
	}

}
