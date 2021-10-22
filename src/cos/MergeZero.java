package cos;

public class MergeZero {
    public String solution(String s) {
	    
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '0' && s.charAt(i+1) != '0')
                answer += "0";
            else if(s.charAt(i)=='1')
                answer += "1";
        }
        return answer;
    }
    public static void main(String[] args) {
        MergeZero sol = new MergeZero();
        String s = "101100011100";
        String ret = sol.solution(s);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� \"" + ret + "\" �Դϴ�.");
    }
}
