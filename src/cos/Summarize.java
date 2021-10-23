package cos;

public class Summarize {
	   public String solution(String s) {
	        s = s.toLowerCase();
	        String answer = "";
	        char previous = s.charAt(0);
	        int counter = 1;
	        
	        for(int i=1; i<s.length(); i++){
	            if(s.charAt(i) == previous)
	                counter++;
	            else {
	                answer += previous;
	                answer += counter;
	                counter = 1;
	                previous = s.charAt(i);
	            }
	        }
	        answer += previous;
	        answer += counter;
	        return answer;
	    }
	   public static void main(String[] args) {
	        Summarize sol = new Summarize();
	        String s = new String("YYYYYbbbBbbBBBMmmM");
	        String ret = sol.solution(s);
	        
	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� \"" + ret + "\" �Դϴ�.");
	   }
}
