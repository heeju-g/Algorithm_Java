package cos;

public class Monster {
	   public int solution(int[] enemies, int[] armies) {
	      
	        int answer = 0;
					int armies_len = armies.length;
					int enemies_len = enemies.length;
					for(int i = 0; i<enemies_len; i++)
						for(int j = 0; j<armies_len; j++)
							if(armies[j]>=enemies[i]){
								answer++;
								break;
							}
							
					if(answer>enemies_len)
					  answer = enemies_len;
	        return answer;
	    }
	    public static void main(String[] args) {
	    	Monster sol = new Monster();
	    	int[] enemies1 = {1, 4, 3};
	    	int[] armies1 = {1, 3};
	    	int ret1 = sol.solution(enemies1, armies1);

	    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

	    	int[] enemies2 = {1, 1, 1};
	    	int[] armies2 = {1, 2, 3, 4};
	    	int ret2 = sol.solution(enemies2, armies2);

	    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }

}
