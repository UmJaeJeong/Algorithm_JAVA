package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class change {

	public static void main(String[] args) {
		int[] coinType = {500,100,50,10,5,1};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int payment = 1000;
			payment -=Integer.parseInt(br.readLine());
			int count = 0;
			
			for (int i = 0; i < coinType.length; i++) {
				count += payment / coinType[i];
				payment = payment % coinType[i];
				if (payment == 0)
					break;
			}
			
			System.out.println(count);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br != null)br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
