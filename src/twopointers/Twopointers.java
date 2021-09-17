package twopointers;
import java.util.*;
/*
 * �� �迭 ��ġ�� : ���ĵ� �� �迭�� ������������ ���ļ� �����ϱ�. twopointers Ȱ��
 */
public class Twopointers {
	//nũ���� a�迭, mũ���� b�迭. p1�� a�迭�� p2�� b�迭�� ������ �� �� p1,p2�� ���� ���ϸ鼭 ���� ���� answer�� �ְ� �ش� �����͸� �̵�.
	//���س����� �� �迭�� ������ �����ͱ��� �����ϸ� break�ϰ� ������ �ٸ� �迭 ���� ���ʷ� answer�� ������ �ȴ�.
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
