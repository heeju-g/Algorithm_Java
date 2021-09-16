package sortingAndsearching;
import  java.util.*;
/*
 * 삽입정렬 : 
 * N개의 숫자가 입력되면 오름차순으로 정렬(버블정렬 사용)하여 출력하는 프로그램.
 * 자연수 N(1<=N<=100)이 입력되고, 두 번쨰 줄엔 N개의 자연수가 공백을 사이에 두고 입력된다. 각 자연수느 정수형 범위 안에 있다.
 */
public class InsertionSort {
	public int[] solution(int n, int[] arr) {
		//i는 1부터 돈다.
		for(int i = 1; i<n; i++) {
			//j for문 바깥에서도 j사용되기 떄문에 여기에 선언해준다.
			int tmp = arr[i], j;
			//j는 i-1부터 점점 작아진다. tmp보다 값이 크면 바꿔주고 break;
			for(j = i-1; j>=0; j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j];
				else break;
			}
			//j for문이 멈춘 지점에 tmp를 넣는다.
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
