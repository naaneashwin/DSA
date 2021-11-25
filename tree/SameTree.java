package tree;

public class SameTree {
//LeetCode 100
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(11);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(2);
		root.right.left = new Node(13);
		root.right.right = new Node(4);
		root.right.right.right = new Node(10);
		
		Node rootq = new Node(5);
		rootq.left = new Node(4);
		rootq.right = new Node(8);
		rootq.left.left = new Node(11);
		rootq.left.left.left = new Node(7);
		rootq.left.left.right = new Node(2);
		rootq.right.left = new Node(13);
		rootq.right.right = new Node(4);
		rootq.right.right.right = new Node(1);
		
		System.out.println(isSameTree(root, rootq));
	}
	public static boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if((p==null && q!=null) ||(p!=null && q==null)) return false;
        
        return (p.key == q.key) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
