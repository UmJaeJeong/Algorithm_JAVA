package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class conferenced {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			int[][] conferenceTime = new int[cnt][2]; // 0번의 배열에는 시작값 1번의 배열에는 끝값을 입력하기 위해 2차원 배열로 선언
			for(int i=0; i<cnt;i++){
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				conferenceTime[i][0] = Integer.parseInt(st.nextToken());
				conferenceTime[i][1] = Integer.parseInt(st.nextToken());
			}
			
			//Comparator 인터페이스를 구현함으로써 정렬의 기준을 설정
			Arrays.sort(conferenceTime, new Comparator<int[]>(){
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]){
						return o1[0]-o2[0];
					}
					return o1[1]-o2[1];
				}
			});
			
			int result = 0; //결과 출력 값 횟수를 저장
			int preEnd = 0; // 아래의 for문에서 비교하기 위해서 사용하는 이전데이터의 끝값
			for(int i=0; i<cnt;i++){
				if(conferenceTime[i][0]>=preEnd){ //현재 시작값이 이전의 끝나는 값보다 크거나 같을경우 족건 / 겹치지 않기에
					preEnd = conferenceTime[i][1];
					result++; // 조건에 성립하는 시간대를 찾음으로 1증가
				}
			}
			System.out.println(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
