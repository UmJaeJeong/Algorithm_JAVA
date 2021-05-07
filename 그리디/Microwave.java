package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Microwave {

	public static void main(String[] args) {
		int[] types = {10,60,300};
		int[] types_cnt ={0,0,0};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			int inputValue = Integer.parseInt(input);
			
			for(int i=2; i>=0;i--){
				types_cnt[i]=inputValue/types[i];
				System.out.println("i : "+i+", "+types_cnt[i]);
				inputValue = inputValue%types[i];
			}
			if(inputValue!=0){
				System.out.println(-1);
			}else{
				System.out.println(types_cnt[2]+" "+types_cnt[1]+" "+types_cnt[0]);
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				if(br!= null){
					br.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
