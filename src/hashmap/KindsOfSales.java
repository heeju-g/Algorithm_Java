package hashmap;
import java.util.*;
/*
 * ������� ���� : N�� ���� �����ϰ� K���� ���ӱ����� �־�����, �� ������ ������� ������ ����ϴ� ���α׷�
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
			//������ �б�(rt �� �ְ�, ���� lt�� �� ���� ������ ��ġ �̵�)
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			HM.put(arr[lt], HM.get(arr[lt])-1);
			//�߿��� ��, ���⼭ lt�� value���� 0�� �Ǹ� �����쿡 �װ� ���� ���̱� ������ Ű�� ������ �ؾ� �Ѵ�.
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
