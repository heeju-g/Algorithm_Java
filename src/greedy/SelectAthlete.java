package greedy;
import java.util.*;
/*
 * ���� ������ - n���� �����ڰ� �ְ� ���� ���, �������� �ɷ�ġ ������ �־�����. �� �������� �ɷ�ġ�� �ٸ���.
 * �����ڸ� �ϴ��� ���ؼ� ��,���� �ɷ�ġ ��ΰ� �� �������� ���� ��� �� ������ ���ߵ��� ���Ѵ�. �ִ� �� ���� ������ ���� �� �� �ִ��� ���ϱ�.
 * 5<=n<=30000 
 * ���⼭ ����for���� ����Ѵٸ� �ð��ʰ�
 */

//����6�� ��ǥ���İ� ���� �κ�
class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    //��������
    @Override
    public int compareTo(Body o){
        return o.h-this.h;
    }
}
public class SelectAthlete {
	/*
	 * ���� ��� Ű�� ������ �ɷ�ġ��� �� ��, �ϴ� Ű�� �������� ������ �� �ڿ� �����Ը� ���س����� o(n)���� ���� �� �ִ�.
	 * ù��° ����� Ű ���� ũ�ϱ� �ϴ� ī����. 1���� ������� ������ ���ٸ� ������ Ż��(Ű�� �̹� �����ϱ�) ���鼭 ������max�� �ٲ㳪����.
	 * max�� �Ǵ� ������� ���ߵȴ�.
	 */
	
	public int solution(ArrayList<Body> arr, int n){
		int cnt=0;
		//arraylist�� collection.sort(���� compareTo�������� ����)
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

