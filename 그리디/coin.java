package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class coin {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int typeCnt = Integer.parseInt(st.nextToken());
			int[] coin_Type = new int[typeCnt];
			int payment = Integer.parseInt(st.nextToken());
			int result = 0;
			
			for(int i=0; i<coin_Type.length;i++){
				coin_Type[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i=coin_Type.length-1;i>=0;i--){
				if(payment- coin_Type[i]>=0){
					result+=payment/coin_Type[i];
					payment = payment%coin_Type[i];
				}
				if(payment==0)break;
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
