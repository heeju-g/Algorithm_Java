package dfsAndbfs;
import java.util.*;
/*
 * 경로탐색(DFS) 인접행렬 사용
 */
class FindRoute {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		//n번 노드이면 경로하나 찾은 거니까 +1
		if(v==n) answer++;
		else{
			for(int i=1; i<=n; i++){
				//v에서 i로 가는 경로가 존재하고, 체크 안 된 상태라면 체크걸고
				if(graph[v][i]==1 && ch[i]==0){
					ch[i]=1;
					DFS(i);
					//호춯 넘어갔으니까(백 하는 시점) 체크 풀어줘야함.
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		FindRoute F = new FindRoute();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new int[n+1][n+1];
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1;
		}
		ch[1]=1;
		F.DFS(1);
		System.out.println(answer);
		kb.close();
	}	
}