package twopointers;
import java.util.*;
/*
 * 두 배열 합치기 : 정렬된 두 배열을 오름차순으로 합쳐서 정렬하기. twopointers 활용
 */
public class Twopointers {
	//n크기의 a배열, m크기의 b배열. p1이 a배열을 p2가 b배열을 차레료 돌 때 p1,p2의 값을 비교하면서 작은 값을 answer에 넣고 해당 포인터를 이동.
	//비교해나가며 한 배열이 마지막 포인터까지 도달하면 break하고 나머지 다른 배열 값도 차례로 answer에 넣으면 된다.
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m){
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		return answer;
	}

	public static void main(String[] args){
		Twopointers T = new Twopointers();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
		}
		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
	}


}
