package array;
import java.util.*;

/*�Ǻ���ġ ���� (���� �� ���� ���Ͽ� ���� ���ڰ� �Ǵ� ����)
 *�Է��� �Ǻ���ġ ������ �� ���� ��. 3<=N<=45
 */

//1. �迭�� ����ϴ� ���
public class Fibonacci {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Fibonacci F = new Fibonacci();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : F.solution(n)) System.out.print(x+" ");
	}
	/*  2. �迭 ������� �ʴ� ���
	 * 	public int[] solution(int n) {
		int a = 1, b = 1, c;
		System.out.println(a+" "+b+" ");
		for(int i = 2; i<nl i++){
			c = a+b;
			System.out.println(c+" ");
			a = b;
			b = c;
		
		}
		for(int i = 2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
		}
		return answer;
	}

	 * 	public static void main(String[] args) {
		Fibonacci F = new Fibonacci();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		F.solution(n);
	}
	 */
}
