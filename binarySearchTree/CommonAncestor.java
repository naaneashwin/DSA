package binarySearchTree;

import binarySearchTree.BST.Node;

//LeetCode 235
public class CommonAncestor {
	public static void main(String[] args) {
		Node head = new Node(5);
		head.left = new Node(3);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.right = new Node(6);
		head.right.right = new Node(7);
		
		Node p = head.left.left;
		Node q = head.left.right;
		
		Node temp = ancestor(head, p, q);
		System.out.println(temp.data);
	}
	private static Node ancestor(Node root, Node p, Node q) {
		
		//If both the nodes are less than current node value
		//then it must present in the left side of the current node
		// if more , then on the right side
		//if one value is smaller and another is bigger than current node
		//the the current node is the lowest common ancestor for both p & q , 
		// because they divide their paths here at this node
		if(p.data<root.data && q.data<root.data) {
			return ancestor(root.left , p, q);
		}
		else if(p.data>root.data && q.data>root.data) {
			return ancestor(root.right , p, q);
		}
		else return root;
	}
}
