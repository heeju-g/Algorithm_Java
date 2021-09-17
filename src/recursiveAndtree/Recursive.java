package recursiveAndtree;

/*
 * 재귀함수 : 자기자신을 호출하는 함수. 재귀함수는 스택프레임을 사용한다. 프레임안에는 지역변수, 매개변수, 복귀주소 정보 등이 담겨있다.
 */
public class Recursive {
	public void DFS(int n) {
		//void에서 return은 함수종료.
		if(n==0) return ;
		else {
			//백트래킹 : 호출한 다음에 syso찍은 거랑, syso먼저 찍고 호출할 때 출력순위가 반대인 것은 스택프레임을 사용하기 때문이다.
			//스택프레임에선 상단의 함수부터 작동한다.
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Recursive R = new Recursive();
		R.DFS(3);
		
	}

}
