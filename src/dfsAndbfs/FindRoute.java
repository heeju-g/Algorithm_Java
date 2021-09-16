package dfsAndbfs;
import java.util.*;
/*
 * ���Ž��(DFS) ������� ���
 */
class FindRoute {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		//n�� ����̸� ����ϳ� ã�� �Ŵϱ� +1
		if(v==n) answer++;
		else{
			for(int i=1; i<=n; i++){
				//v���� i�� ���� ��ΰ� �����ϰ�, üũ �� �� ���¶�� üũ�ɰ�
				if(graph[v][i]==1 && ch[i]==0){
					ch[i]=1;
					DFS(i);
					//ȣ�� �Ѿ���ϱ�(�� �ϴ� ����) üũ Ǯ�������.
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