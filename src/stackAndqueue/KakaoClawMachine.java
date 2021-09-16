package stackAndqueue;
import java.util.*;
/*
 * 인형뽑기
 * 격자판(이차원 배열)에 인형이 담겨있고 옆에 stack 바구니가 있다.
 * 중요 포인트 : pos는 1에서 5이지만 격자판은 인덱스가 0에서 시작한다. 따라서 [i][pos-1]과 같이 -1을 해줘야 한다.
 */
public class KakaoClawMachine {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) {
			//이차원 배열의 행 크기
			for(int i = 0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1];
					//인형을 뽑으면 일단 비워야 하니까 0으로 만든다.
					board[i][pos-1]=0;
					//스택 상단과 비교해서 같으면 터트린다. 스택이 비지 않았고, 상단 값과 지금 꺼낸 인형이 같으면 터트린다.
					if(!stack.isEmpty()&& tmp == stack.peek()) {
						answer+=2;
						stack.pop();
					}
					//다른 인형이면 그냥 스택에 추가로 넣는다.
					else stack.push(tmp);
					//한 번 돌았으면 멈춰야지 계속 들어가서 꺼내면 안된다.
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
