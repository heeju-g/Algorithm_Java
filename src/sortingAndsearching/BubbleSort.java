package sortingAndsearching;
import java.util.*;
/*
 * 버블정렬 : 이웃한 두 수를 비교해서 정렬해나가는 것이다. 한 번의 턴을 하면 가장 큰 수가 맨 뒤에 위치하게 된다. 턴마다 비교횟수가 하나씩 준다. 
 * N개의 숫자가 입력되면 오름차순으로 정렬(버블정렬 사용)하여 출력하는 프로그램.
 * 자연수 N(1<=N<=100)이 입력되고, 두 번쨰 줄엔 N개의 자연수가 공백을 사이에 두고 입력된다. 각 자연수느 정수형 범위 안에 있다.
 */
public class BubbleSort {

	public int[] solution(int n, int[] arr) {
		for(int i = 0; i<n-1; i++) {
			//n이 5라면 턴을 총 4번 하게 된다.
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
