package dfsAndbfs;
import java.util.*;
/*
 * °æ·ÎÅ½»ö(DFS) ÀÎÁ¢Çà·Ä »ç¿ë
 */
class FindRoute {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		//n¹ø ³ëµåÀÌ¸é °æ·ÎÇÏ³ª Ã£Àº °Å´Ï±î +1
		if(v==n) answer++;
		else{
			for(int i=1; i<=n; i++){
				//v¿¡¼­ i·Î °¡´Â °æ·Î°¡ Á¸ÀçÇÏ°í, Ã¼Å© ¾È µÈ »óÅÂ¶ó¸é Ã¼Å©°É°í
				if(graph[v][i]==1 && ch[i]==0){
					ch[i]=1;
					DFS(i);
					//È£­Œ ³Ñ¾î°¬À¸´Ï±î(¹é ÇÏ´Â ½ÃÁ¡) Ã¼Å© Ç®¾îÁà¾ßÇÔ.
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