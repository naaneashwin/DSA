package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
//LeetCode Problem No 872
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.right.left = new Node(5);
		root1.right.left.right= new Node(6);
		root1.right.left.right.left= new Node(7);
		
		System.out.println(leafSimilar(root, root1));
	}
	public static boolean leafSimilar(Node root1, Node root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        getSequence(root1, l1);
        getSequence(root2, l2);
        
        if(l1.size()!= l2.size()) return false;
        
        for(int i=0; i<l1.size(); i++){
            int x = l1.get(i);
            int y = l2.get(i);
            if(x!=y) return false;
        }
        return true;
    }
    private static void getSequence(Node root, List al){
        if(root==null) return;
        
        if(root.left == null && root.right == null){
            al.add(root.key);
            return;
        }
        getSequence(root.left,al);
        getSequence(root.right, al);
    }
}
