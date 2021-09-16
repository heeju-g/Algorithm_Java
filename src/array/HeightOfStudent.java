package array;
import java.util.*;

//보이는 학생 : n명의 학생을 일렬로 세울 때, 앞에서 볼 수 있는 학생의 수 구하기.(뒷사람의 키가 앞사람보다 작아야 보인다.)
public class HeightOfStudent {

	//첫번쨰 학생은 무조건 보일 것이므로 카운팅. i번째일 떄, 그 앞의 수들 중에서 max보다 i번째가 값이 크면 보일 것.
	public int solution(int n, int[] arr) {
		int answer = 1,max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		HeightOfStudent H = new HeightOfStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(H.solution(n, arr));
		kb.close();
	}
	
	
}
