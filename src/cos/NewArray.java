package cos;

import java.util.Arrays;

public class NewArray {
	   public int[] solution(int[] arr) {
			
	        int left = 0, right = arr.length - 1;
	        int idx = 0;
	        int[] answer = new int[arr.length];
	        while(left <= right){
	            if(idx % 2 == 0){
	                answer[idx] = arr[left];
	                left += 1;
	            }
	            else{
	                answer[idx] = arr[right];
	                right -= 1;
	            }
	            idx += 1;
	        }
	        return answer;
	   }
	   public static void main(String[] args) {
	        NewArray sol = new NewArray();
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int[] ret = sol.solution(arr);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
	    }
}
