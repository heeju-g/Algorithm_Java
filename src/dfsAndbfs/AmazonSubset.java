package dfsAndbfs;
import java.util.*;
/*
 * 합이 같은 부분집합(아마존) - DFS
 */
class AmazonSubset{
	static String answer="NO";
	static int n, total=0;
	//yes나오면 그 다음 재귀들은 다 리턴하려고.
	boolean flag=false;
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;
		//더 내려가서 재귀할 필요가 없어서 바로 리턴
		if(sum>total/2) return;
		if(L==n){
			//합이 같은 부분집합 나오면 yes출력하고 나머지 재귀는 다 리턴.
			if((total-sum)==sum){
				answer="YES";
				flag=true;
			}	
		}
		else{
			//두 갈래로 뻗어나가는데 arr[L]을 부분집합에 넣는, 안 넣는 경우.
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args){
		AmazonSubset A = new AmazonSubset();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		A.DFS(0, 0, arr);
		System.out.println(answer);
		kb.close();
	}
}
