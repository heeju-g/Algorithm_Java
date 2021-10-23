package cos;

import java.util.ArrayList;

public class PrimeNum {
	  public int solution(int n) {
	        int answer = 0;
					int i, j, k;
	        ArrayList<Integer> primes = new ArrayList<Integer>();
	        primes.add(2);
	        for (i = 3; i <= n; i += 2) {
	            for ( j = 2; j < i; j++)
	                if (i % j == 0){
					//i�� j�� ����̸� �Ҽ��ƴϴϱ�
	                    break;
	                }
	            if (j==i)
	                primes.add(i);
	        }
	        
	        int primeLen = primes.size();
	        for (i = 0; i < primeLen - 2; i++)
	            for (j = i + 1; j < primeLen - 1; j++)
	                for (k = j + 1; k < primeLen; k++)
	                    if (primes.get(i)+primes.get(j)+primes.get(k)==n)
	                        answer++;
	        return answer;
	    }
	  public static void main(String[] args) {
	    	PrimeNum sol = new PrimeNum();
	        int n1 = 33;
	        int ret1 = sol.solution(n1);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
	        
	        int n2 = 9;
	        int ret2 = sol.solution(n2);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }    
	    
}
