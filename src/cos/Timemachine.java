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

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
