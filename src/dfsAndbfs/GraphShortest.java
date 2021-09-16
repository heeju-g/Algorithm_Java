package dfsAndbfs;
import java.util.*;
/*
 * 그래프 최단거리(BFS) 배열사용
 * 1번 정점에서 각 정점으로 가는 최소 이동 간선수
 */
class GraphShortest {
	static int n, m;
	//인접배열
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v){
		//체크배열, 거리배열
		ch[v]=1;
		dis[v]=0;
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(v);
		while(!queue.isEmpty()){
			//현재정점 cv
			int cv=queue.poll();
			for(int nv : graph.get(cv)){
				if(ch[nv]==0){
					ch[nv]=1;
					queue.offer(nv);
					//nv로 가는 간선은 cv간선을 타고 온 상태니까 여기에 +1
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
		//1번부터 N번까지 있어야 하므로
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