package twopointers;
import java.util.*;
/* Sliding window : ���̰� k�� â�� �����(��) �о���鼭 ���ϱ�.
 * �ִ� ����
 * N�� ������ ���� ��� �� ���ӵ� K�� ������ �ִ� ������� ���ϴ� ���α׷�.
 * 5<=N<=100000, 2<=K<=N 
 */
public class SlidingWindow {

	public int solution(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		//ù k���� ��(window)�� ���س���
		for(int i = 0; i<k; i++) { 
			sum+=arr[i];
		}
		answer = sum;
		//������� �а�����
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
