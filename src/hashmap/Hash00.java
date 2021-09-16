package hashmap;
import java.util.*;

/*
 * 학급회장 선발
 * A,B,C,D,E 다섯 후보가 등록. 반 학생수(5<=N<=50)가 주어지고,
 * 두 번째로 N개 투표용지에 쓰여진 각 후보의 기호가 발표 순서대로 문자열에 입력.
 * (key를 알파벳, value를 득표수로 하면 될 것)
 */
public class Hash00 {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
		//카운팅할 때 유용!! map.getOrDefault : x라는 키가 만들어져 있으면 그 value가져오면 되고 없으면 0리턴
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		//key값으로 value값들 보면서 최대 찾기
		int max = 0;
		for(char key : map.keySet()) {
			//key, value 출력 : System.out.println(x+" "+map.get(x));
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		Hash00 H = new Hash00();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(H.solution(n, str));
		kb.close();
	}

}
