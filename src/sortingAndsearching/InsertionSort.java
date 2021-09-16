package sortingAndsearching;
import  java.util.*;
/*
 * �������� : 
 * N���� ���ڰ� �ԷµǸ� ������������ ����(�������� ���)�Ͽ� ����ϴ� ���α׷�.
 * �ڿ��� N(1<=N<=100)�� �Էµǰ�, �� ���� �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµȴ�. �� �ڿ����� ������ ���� �ȿ� �ִ�.
 */
public class InsertionSort {
	public int[] solution(int n, int[] arr) {
		//i�� 1���� ����.
		for(int i = 1; i<n; i++) {
			//j for�� �ٱ������� j���Ǳ� ������ ���⿡ �������ش�.
			int tmp = arr[i], j;
			//j�� i-1���� ���� �۾�����. tmp���� ���� ũ�� �ٲ��ְ� break;
			for(j = i-1; j>=0; j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j];
				else break;
			}
			//j for���� ���� ������ tmp�� �ִ´�.
			arr[j+1]=tmp;
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		InsertionSort I = new InsertionSort();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : I.solution(n, arr)) System.out.print(x+" ");
		kb.close();
 	}


}
