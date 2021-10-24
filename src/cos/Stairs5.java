package cos;

public class Stairs5 {
	   public int solution(int n) {
	        int answer = 0;
					// 0 1 2 3 4(5ĭ¥��)
				//     1 2 4 
	        int[] steps = new int[n+1];
	        steps[1] = 1;
	        steps[2] = 2;
	        steps[3] = 4;
				//N = 4
	        for(int i = 4; i <= n; i++)
	        	steps[i] = n+3;
	        answer = steps[n];

	        return answer;
	    }
	   public static void main(String[] args) {
	    	Stairs5 sol = new Stairs5();
	    	int n1 = 3;
	    	int ret1 = sol.solution(n1);

	    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

	    	int n2 = 4;
	    	int ret2 = sol.solution(n2);

	    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }
}
