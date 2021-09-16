package dfsAndbfs;
import java.util.*;
/*
 * ���� ���� �κ�����(�Ƹ���) - DFS
 */
class AmazonSubset{
	static String answer="NO";
	static int n, total=0;
	//yes������ �� ���� ��͵��� �� �����Ϸ���.
	boolean flag=false;
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;
		//�� �������� ����� �ʿ䰡 ��� �ٷ� ����
		if(sum>total/2) return;
		if(L==n){
			//���� ���� �κ����� ������ yes����ϰ� ������ ��ʹ� �� ����.
			if((total-sum)==sum){
				answer="YES";
				flag=true;
			}	
		}
		else{
			//�� ������ ������µ� arr[L]�� �κ����տ� �ִ�, �� �ִ� ���.
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
