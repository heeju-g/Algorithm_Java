package recursiveAndtree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ����Ʈ�� ��ȸ(���̿켱Ž�� : ����Ž��) -> BFS
 */


class NodeB{
	int data;
	//nodeŬ������ ��ü �ּҸ� �����ϴ� ����.
	NodeB lt,rt;
	public NodeB(int val) {
		data = val;
		//��ü ���� ������ null��.
		lt = rt = null;
	}
}

public class BinaryTreeLevel {
		NodeB root;
		public void BFS(NodeB root) {
			Queue<NodeB> Q = new LinkedList<>();
			//��Ʈ��� ���� ��.
			Q.offer(root);
			int L = 0;
			while(!Q.isEmpty()) {
				int len = Q.size();
				System.out.print(L+" : ");
				//�� ������ �����ϴ� �� ���(���̸�ŭ ����.)
				for(int i = 0; i<len; i++) {
					//ť���� ��� �ϳ� ���� ���.
					NodeB cur = Q.poll();
					System.out.print(cur.data+" ");
					//���� ����� �ڽĳ�� ������ ť�� �ִ´�.
					if(cur.lt!=null) Q.offer(cur.lt);
					if(cur.rt!=null) Q.offer(cur.rt);
				}
				L++;
				System.out.println();
			}
		}
	
		public static void main(String[] args) {
			BinaryTreeLevel tree = new BinaryTreeLevel();
			tree.root = new NodeB(1);
			tree.root.lt = new NodeB(2);
			tree.root.rt = new NodeB(3);
			tree.root.lt.lt = new NodeB(4);
			tree.root.lt.rt = new NodeB(5);
			tree.root.rt.lt = new NodeB(6);
			tree.root.rt.rt = new NodeB(7);
			//tree.root�� ����� �ּҰ�
			tree.BFS(tree.root);
		}
}
