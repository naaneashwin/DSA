package tree;

public class HeightOfTree {
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		System.out.println(getHeight(root));
	}
	public static int getHeight(Node root) {
		if(root == null) return -1;
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		return 1+Math.max(leftHeight, rightHeight);
	}
}
