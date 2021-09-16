package hashmap;
import java.util.*;
/*
 * 매출액의 종류 : N일 간의 매출기록과 K길이 연속구간이 주어지면, 각 구간별 매출액의 종류를 출력하는 프로그램
 *  sliding window + two pointers + hashMap
 */
public class KindsOfSales {
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		
		for(int i = 0; i<k; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
			
		}
		answer.add(HM.size());
		//two pointers
		int lt = 0;
		for(int rt = k; rt<n; rt++) {
			//윈도우 밀기(rt 값 넣고, 그전 lt는 값 지운 다음에 위치 이동)
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			HM.put(arr[lt], HM.get(arr[lt])-1);
			//중요한 건, 여기서 lt의 value값이 0이 되면 윈도우에 그게 없단 뜻이기 떄문에 키도 삭제를 해야 한다.
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
			lt++;
			answer.add(HM.size());
		}
		return answer;
	}
	
	public static void main(String[] args) {
		KindsOfSales K = new KindsOfSales();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : K.solution(n, k, arr)) System.out.print(x+" ");
		kb.close();
	}
}
