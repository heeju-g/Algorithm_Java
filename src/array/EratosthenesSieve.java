package array;
import java.util.*;
/*
 * �Ҽ��� ���� ���ϱ�
 * �����佺�׳׽��� ü
 */
public class EratosthenesSieve {
	//2(0,1�� �Ҽ� �ƴϴϱ�)���� ���鼭 2�� ����� ��� üũ�Ѵ�. 2�� ����� ������ �ֵ��̱� ������. 
	public int solution(int n) {
		int answer = 0;
		int[] ch = 	new int[n+1];
		for(int i = 2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				//j�� i�� ����� ���ƾ� �ϱ� ������ +i�� ����
				for(int j = i; j<=n; j = j+i) ch[j]=1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		EratosthenesSieve E = new EratosthenesSieve();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(E.solution(n));
		kb.close();
	}
}
