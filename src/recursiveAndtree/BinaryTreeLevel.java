package recursiveAndtree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 이진트리 순회(넓이우선탐색 : 레벨탐색) -> BFS
 */


class NodeB{
	int data;
	//node클래스의 객체 주소를 저장하는 변수.
	NodeB lt,rt;
	public NodeB(int val) {
		data = val;
		//객체 생성 순간엔 null값.
		lt = rt = null;
	}
}

public class BinaryTreeLevel {
		NodeB root;
		public void BFS(NodeB root) {
			Queue<NodeB> Q = new LinkedList<>();
			//루트노드 넣은 것.
			Q.offer(root);
			int L = 0;
			while(!Q.isEmpty()) {
				int len = Q.size();
				System.out.print(L+" : ");
				//각 레벨에 존재하는 값 출력(길이만큼 돈다.)
				for(int i = 0; i<len; i++) {
					//큐에서 노드 하나 뺴서 출력.
					NodeB cur = Q.poll();
					System.out.print(cur.data+" ");
					//현재 노드의 자식노드 있으면 큐에 넣는다.
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
			//tree.root는 노드의 주소값
			tree.BFS(tree.root);
		}
}
