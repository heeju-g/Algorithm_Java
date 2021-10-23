package cos;

import java.util.ArrayList;

public class FindWords {
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;
    public void create_words(int lev, String str) {
        words.add(str);
        for (int i = 0; i < 5; i++) {
            if (lev < 5) {
                create_words(lev+1, str.concat(vowels[i]));
            }
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        words  = new ArrayList<String>();
        create_words(0, "");
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        FindWords sol = new FindWords();
        String word1 = new String("AAAAE");
        int ret1 = sol.solution(word1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        String word2 = new String("AAAE");
        int ret2 = sol.solution(word2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
