package cos;
//ü���� ����Ʈ �̵�
public class Knight {
//1. A7�̶�� �� ��ǥ��(0,6)���� �ٲٱ�
//2. 8������ ���� ��ǥ�� ���µ�, ü���� ������ �͸� ī��Ʈ
 public int solution(String pos) {
				//ü�� �̵� ��ǥ 
				int[] dx = {-2,-1,1,2,2,1,-1,-2};
				int[] dy = {-1,-2,-2,-1,1,2,2,1};
			
				//x��ǥ ��ȯ 
				int initX = pos.charAt(1)-'0';
				int initY = 0;
				if(initX == 1) initX = 7;
				if(initX == 2) initX = 6;
				if(initX == 3) initX = 5;
				if(initX == 4) initX = 4;
				if(initX == 5) initX = 3;
				if(initX == 6) initX = 2;
				if(initX == 7) initX = 1;
				if(initX == 8) initX = 0;
			
				//y��ǥ ��ȯ 
				if(pos.contains("A")){
					initY = 0;
				}else if(pos.contains("B")){
					initY = 1;
				}else if(pos.contains("C")){
					initY = 2;
				}else if(pos.contains("D")){
					initY = 3;
				}else if(pos.contains("E")){
					initY = 4;
				}else if(pos.contains("F")){
					initY = 5;
				}else if(pos.contains("G")){
					initY = 6;
				}else {
					initY = 7;
				}
				
				int answer = 0;
				for(int i=0;i<8;i++){
					if(initX + dx[i]>=0 && initX + dx[i]<8 && initY + dy[i] >=0 && initY + dy[i]>=0){ 
						answer++;
					}
				}
				return answer;	
	}
 public static void main(String[] args) {
     Knight sol = new Knight();
     String pos = "A7";
     int ret = sol.solution(pos);

     System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
 }

}
