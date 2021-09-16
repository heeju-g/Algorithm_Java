package hashmap;
import java.util.*;

/*
 * Anagram(hash): 두 문자열이 알파벳 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이다. 
 * 길이가 같은 두 단어가 아나그램인지 판별하는 프로그램. YES / NO
 */
public class Anagram {
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		//map에 s1입력받으면서 카운트하고(put), s2는 같은 거 나오면 카운트 줄여나간다.
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x: s2.toCharArray()) {
			//s2에 있는 알파벳이 s1에 없을 때
			if(!map.containsKey(x)|| map.get(x)==0) answer = "NO";
			//같은 거 나오면 value -1
			map.put(x, map.get(x)-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Anagram A = new Anagram();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(A.solution(a, b));
		kb.close();
	}
}
