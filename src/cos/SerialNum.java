package cos;

public class SerialNum {
	   public int solution(int[] arr) {
		     int dp[] = new int[arr.length];
		        for(int i = 0; i < dp.length; ++i)
		            dp[i] = 1;
		        for(int i = 1; i < arr.length; ++i)
		            if(arr[i] > arr[i-1])
		                dp[i] = dp[i-1] + 1;
		        int answer = 0;
		        for(int i = 0; i < arr.length; ++i)
		            answer = Math.max(answer, dp[i]);
		        return answer;
		    }
	   public static void main(String[] args) {
	        SerialNum sol = new SerialNum();
	        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
	        int ret = sol.solution(arr);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
	    }
}
