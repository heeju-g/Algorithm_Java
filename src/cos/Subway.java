package cos;

public class Subway {
	   public int func_a(String times){
	        int hour = Integer.parseInt(times.substring(0, 2));
	        int minute = Integer.parseInt(times.substring(3));
	        return hour*60 + minute;
	    }
	    public int solution(String[] subwayTimes, String currentTime) {
	    	//��ĭ1
	        int currentMinute = func_a(currentTime);
	        int INF = 1000000000;
	        int answer = INF;
	        for(int i = 0; i < subwayTimes.length; ++i){
	        	//��ĭ2
	            int subwayMinute = func_a(subwayTimes[i]);
	            //��ĭ3
	            if(subwayMinute>=currentMinute){
	                answer = subwayMinute - currentMinute;
	                break;
	            }
	        }
	        if(answer == INF)
	            return -1;
	        return answer;
	    }

	    public static void main(String[] args) {
	        Subway sol = new Subway();
	        String[] subwayTimes1 = {"05:31", "11:59", "13:30", "23:32"};
	        String currentTime1 = "12:00";
	        int ret1 = sol.solution(subwayTimes1, currentTime1);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

	        String[] subwayTimes2 = {"14:31", "15:31"};
	        String currentTime2 = "15:31";
	        int ret2 = sol.solution(subwayTimes2, currentTime2);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }
}
