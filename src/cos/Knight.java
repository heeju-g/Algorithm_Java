package cos;
//체스판 나이트 이동
public class Knight {
//1. A7이라는 걸 좌표값(0,6)으로 바꾸기
//2. 8방향을 돌며 좌표를 도는데, 체스판 내부인 것만 카운트
 public int solution(String pos) {
				//체스 이동 좌표 
				int[] dx = {-2,-1,1,2,2,1,-1,-2};
				int[] dy = {-1,-2,-2,-1,1,2,2,1};
			
				//x좌표 변환 
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
			
				//y좌표 변환 
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

     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }

}
