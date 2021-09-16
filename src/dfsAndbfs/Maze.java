package dfsAndbfs;
import java.util.*;
/*
 * 미로탐색(DFS)
 * 출발점(1,1) 도착점(n,n). 격자판에서 1은 벽이고 0은 통로이다. 도착점까지 갈 수 있는 경로의 수를 구하기.
 */
class Maze {
	//상,하,좌,우
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board;
	static int answer=0;

	public void DFS(int x, int y){
		//종착점 도착
		if(x==7 && y==7) answer++;
		else{
			//i는 방향
			for(int i=0; i<4; i++){
				//
				int nx=x+dx[i];
				int ny=y+dy[i];
				//경계선 안쪽이고, 지점이 0이어야 갈 수 있는 곳이다.
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
					//갔으니까 체크하고
					board[nx][ny]=1;
					DFS(nx, ny);
					//뒤로 백할 때 0으로 다시 풀어줘야 한다.
					board[nx][ny]=0;
				}
			}
		}	
	}

	public static void main(String[] args){
		Maze M = new Maze();
		Scanner kb = new Scanner(System.in);
		//1번 인덱스부터 사용할 거라서.
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