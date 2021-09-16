package dfsAndbfs;
import java.util.*;
/*
 * �׷��� �ִܰŸ�(BFS) �迭���
 * 1�� �������� �� �������� ���� �ּ� �̵� ������
 */
class GraphShortest {
	static int n, m;
	//�����迭
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v){
		//üũ�迭, �Ÿ��迭
		ch[v]=1;
		dis[v]=0;
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(v);
		while(!queue.isEmpty()){
			//�������� cv
			int cv=queue.poll();
			for(int nv : graph.get(cv)){
				if(ch[nv]==0){
					ch[nv]=1;
					queue.offer(nv);
					//nv�� ���� ������ cv������ Ÿ�� �� ���´ϱ� ���⿡ +1
					dis[nv]=dis[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args){
		GraphShortest G = new GraphShortest ();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		//1������ N������ �־�� �ϹǷ�
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);
		}
		G.BFS(1);
		for(int i=2; i<=n; i++){
			System.out.println(i+" : "+dis[i]);
		}
		kb.close();
	}	
}