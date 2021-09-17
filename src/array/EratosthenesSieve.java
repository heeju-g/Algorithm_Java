package array;
import java.util.*;
/*
 * 소수의 개수 구하기
 * 에라토스테네스의 체
 */
public class EratosthenesSieve {
	//2(0,1은 소수 아니니까)부터 가면서 2의 배수들 모두 체크한다. 2를 약수로 가지는 애들이기 때문에. 
	public int solution(int n) {
		int answer = 0;
		int[] ch = 	new int[n+1];
		for(int i = 2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				//j는 i의 배수로 돌아야 하기 때문에 +i씩 증기
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
