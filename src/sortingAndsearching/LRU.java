package sortingAndsearching;
import java.util.*;
/*
 * Least recently used(캐시메모리) : 캐시에서 작업을 제거할 때, 가장 오랫동안 사용되지 않은 것을 제거하는 알고리즘
 * s길이의 캐시가 생기고,n개의 작업이 입력되고, 두 번째 줄에 n개의 작업번호가 처리순으로 주어진다. 캐시메모리 상태를 최근 사용된 작업부터 출력.
 */
public class LRU {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) {
			//x가 cache에 존재하는지
			int pos = -1;
			//돌면서 캐시 안에 x가 있으면 hit -> hit된 지점 저장(pos를 i로 변경)
			for(int i =0; i<size; i++) if(x==cache[i]) pos=i;
			//값이 안에 없는 경우, 하나씩 자리를 뒤로 떙겨준다.
			if(pos==-1) {
				for(int i = size-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}
			//같은 값이 있으면
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
