package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int peopleCnt = Integer.parseInt(br.readLine());
			int[] times = new int[peopleCnt];
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0 ; i<peopleCnt;i++){
				times[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(times);
			
			int sum = 0;
			for(int i= 0 ;i<times.length;i++){
				sum +=times[i];
				int s_sum = 0;
				for(int j= 0;j<i;j++){
					s_sum+=times[j];
				}
				sum += s_sum;
			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
