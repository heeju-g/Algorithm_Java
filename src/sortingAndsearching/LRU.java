package sortingAndsearching;
import java.util.*;
/*
 * Least recently used(ĳ�ø޸�) : ĳ�ÿ��� �۾��� ������ ��, ���� �������� ������ ���� ���� �����ϴ� �˰���
 * s������ ĳ�ð� �����,n���� �۾��� �Էµǰ�, �� ��° �ٿ� n���� �۾���ȣ�� ó�������� �־�����. ĳ�ø޸� ���¸� �ֱ� ���� �۾����� ���.
 */
public class LRU {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) {
			//x�� cache�� �����ϴ���
			int pos = -1;
			//���鼭 ĳ�� �ȿ� x�� ������ hit -> hit�� ���� ����(pos�� i�� ����)
			for(int i =0; i<size; i++) if(x==cache[i]) pos=i;
			//���� �ȿ� ���� ���, �ϳ��� �ڸ��� �ڷ� �����ش�.
			if(pos==-1) {
				for(int i = size-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}
			//���� ���� ������
			else {
				for(int i = pos; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
	
	public static void main(String[] args) {
		LRU L = new LRU();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : L.solution(s, n, arr)) System.out.print(x+" ");
		kb.close();
	}

}
