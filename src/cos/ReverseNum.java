package cos;

public class ReverseNum {
	   public String reverse(String number) {
	        String reverseNumber = "";
	        for(int i = number.length()-1; i >= 0; i--)
	            reverseNumber +=  number.charAt(i);
	        return reverseNumber;
	    }

	    public String solution(int n) {
	        String answer = "";
	        for(int i = 0; i < n; i++) {
	            answer += Integer.toString(i+1);
	            answer = reverse(answer);
	        }
	        return answer;
	    }
	    public static void main(String[] args) {
	       ReverseNum sol = new ReverseNum();
	        int n = 5;
	        String ret = sol.solution(n);
	        
	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� \"" + ret + "\" �Դϴ�.");
	    }
}
