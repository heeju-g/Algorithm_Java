package sortingAndsearching;
import java.util.*;


/*
 * ��������
 * N���� ���ڰ� �ԷµǸ� ������������ ����(�������� ���)�Ͽ� ����ϴ� ���α׷�.
 * �ڿ��� N(1<=N<=100)�� �Էµǰ�, �� ���� �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµȴ�. �� �ڿ����� ������ ���� �ȿ� �ִ�.
 */
public class SelectionSort {
	public int[] solution(int n, int[] arr) {
		//������ �ڷ�� ���� �� �ʿ� �����ϱ� n-1
		for(int i = 0; i<n-1; i++) {
			//idx�� �ε��� ��ȣ.
			int idx = i;
			//j�� ù �ε���(i)+1�� �صΰ� �񱳸� �س����µ�, �迭 �� ���� ���� ���� ������ ���� �Ϸ��� idx�� j�� �ٲ��ְ�
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx = j;
			}
			//������ ������ �ٲپ��ָ� �� �� ������ �Ǿ, ���� ���� ���� �ϴ� �� ������ ��ġ�ϰ� �Ǹ鼭 �� ���� �� ���̴�.
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		//�� n-1�� ��ȸ�ϸ鼭 �ٲٸ� ��������� �������� ���� �ϼ�.
		
		return arr;
	}
	
	public static void main(String[] args) {
		SelectionSort S = new SelectionSort();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : S.solution(n, arr)) System.out.print(x+" ");
	}

}
