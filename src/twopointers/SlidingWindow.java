package twopointers;
import java.util.*;
/* Sliding window : 길이가 k인 창을 만들고(합) 밀어나가면서 구하기.
 * 최대 매출
 * N일 동안의 매출 기록 중 연속된 K일 동안의 최대 매출액을 구하는 프로그램.
 * 5<=N<=100000, 2<=K<=N 
 */
public class SlidingWindow {

	public int solution(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		//첫 k개의 합(window)을 구해놓고
		for(int i = 0; i<k; i++) { 
			sum+=arr[i];
		}
		answer = sum;
		//여기부터 밀고나가기
		for(int i = k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		SlidingWindow S = new SlidingWindow();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(S.solution(n, k, arr));
		kb.close();
	}
}
