package cos;
import java.util.*;
public class KaprekarNum {
	   public int[] solution(int k) {
	        int[] kaprekarArr = new int[k];
	        int count = 0;
	        for (int i = 1; i <= k; i++) {
						//제곱수 squareNum (45*45)
	        	long squareNum = i * i;
	        	long divisor = 1;
	        	while (squareNum / divisor != 0) {

	        		long front = squareNum / divisor;
	        		long back = squareNum % divisor;
	        		divisor *= 10;
	        		if (back != 0 && front != 0)
	        			if (front + back == i) {
	        				kaprekarArr[count] = i;
	        				count++;
	        			}
	        	}
	        }
	        int[] answer = new int[count];
	        for (int i = 0; i < count; i++) 
	        	answer[i] = kaprekarArr[i];
	        return answer;
	    }
	   public static void main(String[] args) {
	        KaprekarNum sol = new KaprekarNum();
	        int k = 500;
	        int[] ret = sol.solution(k);

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
}
