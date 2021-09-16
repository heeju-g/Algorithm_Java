package recursiveAndtree;

/*
 * 이진트리 순회(깊이우선탐색 DFS) 
 * 전위순회, 중위순회
 */
class Node{
	int data;
	//node클래스의 객체 주소를 저장하는 변수.
	Node lt,rt;
	public Node(int val) {
		data = val;
		//객체 생성 순간엔 null값.
		lt = rt = null;
	}
}
public class BinaryTree {
	Node root;
	public void DFS(Node root) {
		//루트값이 null이면 말단 노드로 온 것이기 때문에 종료.
		if(root ==null) return;
		else {
			//가지를 뻗는 것(함수호출)
			//전위순회의 경우 여기에 System.out.print(root.data+" ");
			DFS(root.lt);
			//중위순회
			System.out.print(root.data+" ");
			DFS(root.rt);
			//후위순회는 여기에.
		}
		
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
