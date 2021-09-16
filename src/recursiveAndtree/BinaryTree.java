package recursiveAndtree;

/*
 * ����Ʈ�� ��ȸ(���̿켱Ž�� DFS) 
 * ������ȸ, ������ȸ
 */
class Node{
	int data;
	//nodeŬ������ ��ü �ּҸ� �����ϴ� ����.
	Node lt,rt;
	public Node(int val) {
		data = val;
		//��ü ���� ������ null��.
		lt = rt = null;
	}
}
public class BinaryTree {
	Node root;
	public void DFS(Node root) {
		//��Ʈ���� null�̸� ���� ���� �� ���̱� ������ ����.
		if(root ==null) return;
		else {
			//������ ���� ��(�Լ�ȣ��)
			//������ȸ�� ��� ���⿡ System.out.print(root.data+" ");
			DFS(root.lt);
			//������ȸ
			System.out.print(root.data+" ");
			DFS(root.rt);
			//������ȸ�� ���⿡.
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
