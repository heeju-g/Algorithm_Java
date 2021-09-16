package array;
import java.util.*;

/*
 * 임시반장 구하기
 * n명의 학생이 주어지고 5학년까지 존재한다. 1-5학년을 지내오면서 한 번이랃 같은 반이었던 사람이 가장 많은 학생이 임시반장이 된다.
 */
public class ClassPresident {
	public int solution(int n, int[][] arr) {
		int answer = 0, max = 0;
		//i,j는 학생
		for(int i = 1; i<=n; i++) {
			int cnt = 0;
			for(int j = 1; j<=n; j++) {
				for(int k = 1; k<=5; k++) {
					if(arr[i][j]==arr[j][k]) {
						cnt++;
						//한 명을 여러 번 카운트하면 안되기 때문에 break;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ClassPresident C = new ClassPresident();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i = 1; i<=n; i++) {
			for(int j = i; j<=5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(C.solution(n, arr));
		kb.close();
	}

}
