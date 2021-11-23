package tree;

public class TraversingOrders {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		
		pre_Order(root);
		System.out.println();
		in_Order(root);
		System.out.println();
		post_Order(root);
		
	}
	public static void pre_Order(Node root) {
		//root, left, right
		if(root==null) return;
		
		System.out.print(root.key+",");
		pre_Order(root.left);
		pre_Order(root.right);
	}
	public static void in_Order(Node root) {
		// left,root, right
		if(root==null) return;
		
		in_Order(root.left);
		System.out.print(root.key+",");
		in_Order(root.right);
	}
	public static void post_Order(Node root) {
		//left, right, root
		if(root==null) return;
		
		post_Order(root.left);
		post_Order(root.right);
		System.out.print(root.key+",");
	}
}
class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}
