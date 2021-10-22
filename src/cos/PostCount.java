package cos;

public class PostCount {
    public int func_a(int n){
        int ret = 1;
        while(n > 0){
            ret *= 10;
            n--;
        }
        return ret;
    }

    int func_b(int n){
			//�ڸ���
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10;
        }
        return ret;
    }
    
    int func_c(int n){
			//��������
        int ret = 0;
        while(n > 0){
            ret += n%10;
            n /= 10;
        }
        return ret;
    }
    
	public int solution(int num) {
        int nextNum = num;
        while(true){
            nextNum++;
            int length = func_b(nextNum);
            if(length % 2 != 0)
                continue;

            int divisor = func_a(length/2);
            int front = nextNum / divisor;
            int back = nextNum % divisor;
            
            int frontSum = func_c(front);
            int backSum = func_c(back);
            if(frontSum == backSum)
                break;
        }
        return nextNum - num;
    }
	  public static void main(String[] args) {
	        PostCount sol = new PostCount();
	        int num1 = 1;
	        int ret1 = sol.solution(num1);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

	        int num2 = 235386;
	        int ret2 = sol.solution(num2);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }
}
