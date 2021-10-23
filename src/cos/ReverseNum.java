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
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
	    }
}
