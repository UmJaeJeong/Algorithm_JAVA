package 힙;

import java.util.PriorityQueue;

public class 라면공장 {
    

	public static void main(String[] args) {
		
	}
	
	//stock 현재량  , dates 날짜,  supplies 날짜에 맞는 공급량 ,  k 공급받을수 있는 날짜
	
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int idx = 0;
        int idx2= 0;
        while(stock<k){
            for(int i=idx; i<dates.length;i++){
                 if(dates[i]<=stock){
                    pq.add(supplies[i]);
                    idx2 = i;
                }
            }
               
            stock+=pq.poll();
            idx = idx2+1;
            answer++;
            
        }
        return answer;
    }

}
