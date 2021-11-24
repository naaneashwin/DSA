package tree;

public class PathSum {
//LeetCode 112
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(11);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(2);
		root.right.left = new Node(13);
		root.right.right = new Node(4);
		root.right.right.right = new Node(1);
		
		if(xyz(root,0,27)) System.out.println("True");
		else System.out.println("False");
	}
	private static boolean xyz(Node root, int sum, int targetSum){
        if(root==null) return false;
        
        sum += root.key;
        
        if(root.left == null && root.right == null){
           if(sum==targetSum) return true;
            
        }
        
        return (xyz(root.left,sum, targetSum) || xyz(root.right,sum, targetSum));

    }
}
