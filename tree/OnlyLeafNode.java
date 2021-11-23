package tree;

public class OnlyLeafNode {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		printLeafNode(root);
	}
	public static int printLeafNode(Node root) {
		if(root==null) {
			return -1;
		}
		int l = printLeafNode(root.left);
		int r = printLeafNode(root.right);
		if(l==-1 && r==-1) {
			System.out.println(root.key);
		}
		
		return 1;
	}
}
