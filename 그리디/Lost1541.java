package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lost1541 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int result = 0;
			String[] inputSpilt = input.split("\\-");
			int count = inputSpilt.length;
			int[] values = new int[count];
			int cnt = 0;
			for(String minus : inputSpilt){
				String[] miusSpilt =minus.split("\\+");
				for(String plus : miusSpilt){
					values[cnt]+=Integer.parseInt(plus);
				}
				cnt++;
			}
			for(int i=0; i<values.length;i++){
				if(i==0){
					result +=values[i];
				}else{
					result -=values[i];
				}
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(br!=null)br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
