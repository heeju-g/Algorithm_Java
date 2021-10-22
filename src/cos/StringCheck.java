package cos;

public class StringCheck {
    public boolean solution(String password) {
		
        int length = password.length();
        for(int i = 0; i < length - 2; ++i){
            int firstCheck = password.charAt(i + 1) - password.charAt(i);
            int secondCheck = password.charAt(i+1) - password.charAt(i+2);
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        StringCheck sol = new StringCheck();
        String password1 = "cospro890";
        boolean ret1 = sol.solution(password1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");


        String password2 = "cba323";
        boolean ret2 = sol.solution(password2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2+ " �Դϴ�.");       
    }
}
