package cos;

public class CommonDivisor {
	public int func_a(int a, int b) {
		int mod = a % b;

		while(mod > 0) {
			a = b;
			b = mod;
			mod = a % b;
		}

		return b;
	}

	public int func_b(int n) {
		int answer = 0;

		for(int i = 1; i <= n; i++) {
			if(func_c(n,i))
				answer++;
		}

		return answer;
	}

	public boolean func_c(int p, int q) {
		if(p % q == 0)
			return true;
		else
			return false;
	}

	public int solution(int a, int b, int c) {
		int answer = 0;

		int gcd = func_a(func_a(a,b),c);
		//c�� ������ �ƴϴ�(boolean�̴ϱ�)
		answer = func_b(gcd);

		return answer;
	}
	public static void main(String[] args) {
		CommonDivisor sol = new CommonDivisor();
		int a = 24;
		int b = 9;
		int c = 15;
		int ret = sol.solution(a, b, c);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
	}
}
