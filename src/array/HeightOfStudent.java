package array;
import java.util.*;

//���̴� �л� : n���� �л��� �Ϸķ� ���� ��, �տ��� �� �� �ִ� �л��� �� ���ϱ�.(�޻���� Ű�� �ջ������ �۾ƾ� ���δ�.)
public class HeightOfStudent {

	//ù���� �л��� ������ ���� ���̹Ƿ� ī����. i��°�� ��, �� ���� ���� �߿��� max���� i��°�� ���� ũ�� ���� ��.
	public int solution(int n, int[] arr) {
		int answer = 1,max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		HeightOfStudent H = new HeightOfStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(H.solution(n, arr));
		kb.close();
	}
	
	
}
