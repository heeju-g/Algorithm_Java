package cos;

import java.util.Arrays;

public class XYRobot {
    public int[] solution(String commands) {
        int[] answer = {0, 0};
        for(int i = 0; i < commands.length(); ++i){
            if (commands.charAt(i) == 'L')
                answer[0] -= 1;
            else if(commands.charAt(i) == 'R')
                answer[0] += 1;
            else if(commands.charAt(i) == 'U')
                answer[1] += 1;
            else if(commands.charAt(i) == 'D')
                answer[1] -= 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        XYRobot sol = new XYRobot();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}
