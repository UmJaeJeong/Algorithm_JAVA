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
			int[][] conferenceTime = new int[cnt][2]; // 0���� �迭���� ���۰� 1���� �迭���� ������ �Է��ϱ� ���� 2���� �迭�� ����
			for(int i=0; i<cnt;i++){
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				conferenceTime[i][0] = Integer.parseInt(st.nextToken());
				conferenceTime[i][1] = Integer.parseInt(st.nextToken());
			}
			
			//Comparator �������̽��� ���������ν� ������ ������ ����
			Arrays.sort(conferenceTime, new Comparator<int[]>(){
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]){
						return o1[0]-o2[0];
					}
					return o1[1]-o2[1];
				}
			});
			
			int result = 0; //��� ��� �� Ƚ���� ����
			int preEnd = 0; // �Ʒ��� for������ ���ϱ� ���ؼ� ����ϴ� ������������ ����
			for(int i=0; i<cnt;i++){
				if(conferenceTime[i][0]>=preEnd){ //���� ���۰��� ������ ������ ������ ũ�ų� ������� ���� / ��ġ�� �ʱ⿡
					preEnd = conferenceTime[i][1];
					result++; // ���ǿ� �����ϴ� �ð��븦 ã������ 1����
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
