package greedy;
import java.util.*;
/*
 * 선수 선발전 - n명의 지원자가 있곡 각각 흰색, 검은색의 능력치 정보가 주어진다. 각 선수마다 능력치는 다르다.
 * 지원자를 일대일 비교해서 흰,검은 능력치 모두가 한 선수보다 낮은 경우 그 선수는 선발되지 못한다. 최대 몇 명의 선수가 선발 될 수 있는지 구하기.
 * 5<=n<=30000 
 * 여기서 이중for문을 사용한다면 시간초과
 */

//섹션6에 좌표정렬과 같은 부분
class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    //내림차순
    @Override
    public int compareTo(Body o){
        return o.h-this.h;
    }
}
public class SelectAthlete {
	/*
	 * 예를 들어 키와 몸무게 능력치라고 할 때, 일단 키로 내림차순 정렬을 한 뒤에 몸무게를 비교해나가면 o(n)으로 끝낼 수 있다.
	 * 첫번째 사람은 키 제일 크니까 일단 카운팅. 1등인 사람보다 몸무게 적다면 무조거 탈락(키가 이미 작으니까) 가면서 몸무게max를 바꿔나간다.
	 * max가 되는 사람들이 선발된다.
	 */
	
	public int solution(ArrayList<Body> arr, int n){
		int cnt=0;
		//arraylist는 collection.sort(위에 compareTo기준으로 정렬)
		Collections.sort(arr);
		int max=Integer.MIN_VALUE;
		for(Body ob : arr){
			if(ob.w>max){
				max=ob.w;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args){
		SelectAthlete S = new SelectAthlete();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int h=kb.nextInt();
			int w=kb.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(S.solution(arr, n));
		kb.close();
	}
}

