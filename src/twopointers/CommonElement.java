package twopointers;
import java.util.*;


/* Two pointers Algorithm
 * 공통원소 구하기
 * A, B 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램. 
 * 첫 번째로 집합 A의 크기 N(1<=N<=30000), 두 번째로 N개의 원소(중복 X)
 * 그 다음으로 집합 B의 크기와 M개의 원소가 주어짐. 각 집합의 원소는 1,000,000,000이하의 자연수.
 */
public class CommonElement {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		//A,B 오름차순 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		int p1 = 0,p2 = 0;
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		CommonElement C = new CommonElement();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i<m; i++) {
			b[i] = kb.nextInt();
		}
		for(int x : C.solution(n, m, a, b)) System.out.print(x+" ");
		kb.close();
	}

}
