package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
//traverse through level
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		iterativeLevelTraverse(root);
		System.out.println();
		recusiveLevelTraverse(root);
		
	}
	private static void recusiveLevelTraverse(Node root) {
		int h = getHeight(root);
		for(int i=0; i<=h; i++) {
			printCurrentLevel(root, i);
		}
	}
	private static void iterativeLevelTraverse(Node root) {
	
	//S.C O(N), T.C O(N)
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.println(temp.key);
			
			if(temp.left!=null) {
				q.add(temp.left);
			}
			
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
	}
	private static int getHeight(Node root) {
		if(root==null) return -1;
		
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		return 1+Math.max(l, r);
	}
	private static void printCurrentLevel(Node root, int currLev) {
		if(root == null) return;
		
		if(currLev == 0) {
			System.out.println(root.key);
		}
		printCurrentLevel(root.left, --currLev);
		printCurrentLevel(root.right, currLev);
	}
}
