package tree;

public class CountNodes {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		
		System.out.println(getNodeCount(root));
	}
	public static int getNodeCount(Node root) {
		if(root == null) return 0;
		
		return 1+getNodeCount(root.left)+getNodeCount(root.right);
	}
}
