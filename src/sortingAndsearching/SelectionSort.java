package sortingAndsearching;
import java.util.*;


/*
 * 선택정렬
 * N개의 숫자가 입력되면 오름차순으로 정렬(선택정렬 사용)하여 출력하는 프로그램.
 * 자연수 N(1<=N<=100)이 입력되고, 두 번쨰 줄엔 N개의 자연수가 공백을 사이에 두고 입력된다. 각 자연수느 정수형 범위 안에 있다.
 */
public class SelectionSort {
	public int[] solution(int n, int[] arr) {
		//마지막 자료는 굳이 돌 필요 없으니까 n-1
		for(int i = 0; i<n-1; i++) {
			//idx는 인덱스 번호.
			int idx = i;
			//j를 첫 인덱스(i)+1로 해두고 비교를 해나가는데, 배열 내 가장 작은 값이 앞으로 오게 하려면 idx랑 j를 바꿔주고
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx = j;
			}
			//값들을 실제로 바꾸어주면 한 번 정렬이 되어서, 가장 작은 값이 일단 맨 앞으로 위치하게 되면서 한 바퀴 돈 것이다.
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		//총 n-1번 순회하면서 바꾸면 결과적으로 오름차순 정렬 완성.
		
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
