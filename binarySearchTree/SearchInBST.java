package binarySearchTree;

import binarySearchTree.BST.Node;

public class SearchInBST {
	public static void main(String[] args) {
		Node head = new Node(5);
		head.left = new Node(3);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.right = new Node(6);
		head.right.right = new Node(7);
		
		int target = 50;
		
		System.out.println(find(head, target));
	}
	private static boolean find(Node root, int target) {
		
		if(null == root) return false;
		if(root.data == target) return true;
		else if(root.data > target) {
			return find(root.left, target);
		}
		else return find(root.right, target);
		//return true;
	}
}
