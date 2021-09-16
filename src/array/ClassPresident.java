package array;
import java.util.*;

/*
 * �ӽù��� ���ϱ�
 * n���� �л��� �־����� 5�г���� �����Ѵ�. 1-5�г��� �������鼭 �� ���̍� ���� ���̾��� ����� ���� ���� �л��� �ӽù����� �ȴ�.
 */
public class ClassPresident {
	public int solution(int n, int[][] arr) {
		int answer = 0, max = 0;
		//i,j�� �л�
		for(int i = 1; i<=n; i++) {
			int cnt = 0;
			for(int j = 1; j<=n; j++) {
				for(int k = 1; k<=5; k++) {
					if(arr[i][j]==arr[j][k]) {
						cnt++;
						//�� ���� ���� �� ī��Ʈ�ϸ� �ȵǱ� ������ break;
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
