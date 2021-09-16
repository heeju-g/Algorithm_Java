package dfsAndbfs;
import java.util.*;
/*
 * �̷�Ž��(DFS)
 * �����(1,1) ������(n,n). �����ǿ��� 1�� ���̰� 0�� ����̴�. ���������� �� �� �ִ� ����� ���� ���ϱ�.
 */
class Maze {
	//��,��,��,��
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board;
	static int answer=0;

	public void DFS(int x, int y){
		//������ ����
		if(x==7 && y==7) answer++;
		else{
			//i�� ����
			for(int i=0; i<4; i++){
				//
				int nx=x+dx[i];
				int ny=y+dy[i];
				//��輱 �����̰�, ������ 0�̾�� �� �� �ִ� ���̴�.
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
					//�����ϱ� üũ�ϰ�
					board[nx][ny]=1;
					DFS(nx, ny);
					//�ڷ� ���� �� 0���� �ٽ� Ǯ����� �Ѵ�.
					board[nx][ny]=0;
				}
			}
		}	
	}

	public static void main(String[] args){
		Maze M = new Maze();
		Scanner kb = new Scanner(System.in);
		//1�� �ε������� ����� �Ŷ�.
		board=new int[8][8];
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;
		M.DFS(1, 1);
		System.out.print(answer);
		kb.close();
	}
}