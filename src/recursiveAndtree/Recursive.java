package recursiveAndtree;

/*
 * ����Լ� : �ڱ��ڽ��� ȣ���ϴ� �Լ�. ����Լ��� ������������ ����Ѵ�. �����Ӿȿ��� ��������, �Ű�����, �����ּ� ���� ���� ����ִ�.
 */
public class Recursive {
	public void DFS(int n) {
		//void���� return�� �Լ�����.
		if(n==0) return ;
		else {
			//��Ʈ��ŷ : ȣ���� ������ syso���� �Ŷ�, syso���� ��� ȣ���� �� ��¼����� �ݴ��� ���� ������������ ����ϱ� �����̴�.
			//���������ӿ��� ����� �Լ����� �۵��Ѵ�.
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Recursive R = new Recursive();
		R.DFS(3);
		
	}

}
