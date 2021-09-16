package sortingAndsearching;
import java.util.*;
/*
 * �������� : �̿��� �� ���� ���ؼ� �����س����� ���̴�. �� ���� ���� �ϸ� ���� ū ���� �� �ڿ� ��ġ�ϰ� �ȴ�. �ϸ��� ��Ƚ���� �ϳ��� �ش�. 
 * N���� ���ڰ� �ԷµǸ� ������������ ����(�������� ���)�Ͽ� ����ϴ� ���α׷�.
 * �ڿ��� N(1<=N<=100)�� �Էµǰ�, �� ���� �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµȴ�. �� �ڿ����� ������ ���� �ȿ� �ִ�.
 */
public class BubbleSort {

	public int[] solution(int n, int[] arr) {
		for(int i = 0; i<n-1; i++) {
			//n�� 5��� ���� �� 4�� �ϰ� �ȴ�.
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		BubbleSort B = new BubbleSort();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : B.solution(n, arr)) System.out.print(x+" ");
		kb.close();
		
 	}
}
