package cos;

public class Timemachine {
    public long solution(long num) {
        num++;
				String answer = Long.toString(num);
				answer = answer.replace('0','1');
			 	return Long.parseLong(answer);
      
    }
    public static void main(String[] args) {
        Timemachine sol = new Timemachine();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
