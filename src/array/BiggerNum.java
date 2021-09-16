package array;
import java.util.*;

// N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램.(첫번째 수는 무조건 출력)
public class BiggerNum {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i = 1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		BiggerNum B = new BiggerNum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ; i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : B.solution(n, arr)) {
			System.out.print(x+" ");
		}
		kb.close();
	}


}
