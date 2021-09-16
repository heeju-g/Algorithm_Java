package stackAndqueue;
import java.util.*;
/*
 * �����̱�
 * ������(������ �迭)�� ������ ����ְ� ���� stack �ٱ��ϰ� �ִ�.
 * �߿� ����Ʈ : pos�� 1���� 5������ �������� �ε����� 0���� �����Ѵ�. ���� [i][pos-1]�� ���� -1�� ����� �Ѵ�.
 */
public class KakaoClawMachine {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) {
			//������ �迭�� �� ũ��
			for(int i = 0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1];
					//������ ������ �ϴ� ����� �ϴϱ� 0���� �����.
					board[i][pos-1]=0;
					//���� ��ܰ� ���ؼ� ������ ��Ʈ����. ������ ���� �ʾҰ�, ��� ���� ���� ���� ������ ������ ��Ʈ����.
					if(!stack.isEmpty()&& tmp == stack.peek()) {
						answer+=2;
						stack.pop();
					}
					//�ٸ� �����̸� �׳� ���ÿ� �߰��� �ִ´�.
					else stack.push(tmp);
					//�� �� �������� ������� ��� ���� ������ �ȵȴ�.
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		KakaoClawMachine K = new KakaoClawMachine();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [][] board = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i<m; i++) moves[i] = kb.nextInt();
		System.out.println(K.solution(board, moves));
		kb.close();
	}
}
