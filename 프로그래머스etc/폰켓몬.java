package 프로그래머스etc;

import java.util.Arrays;

public class 폰켓몬 {

	public static void main(String[] args) {
		int[] nums = new int[] {3,1,2,3};
		System.out.println(solution(nums));
		nums = new int[] {3,3,3,2,2,4};
		System.out.println(solution(nums));
		nums = new int[] {3,3,3,2,2,2};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int tmp = 0;
         for(int i=0; i<nums.length;i++){
             if(tmp != nums[i] ){
                  cnt++;
                 tmp = nums[i];
             } 
         }
        if(cnt>nums.length/2) cnt = nums.length/2;
        return cnt;
    }

}
