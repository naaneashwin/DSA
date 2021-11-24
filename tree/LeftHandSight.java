package tree;

//T.C O(N)N-no.of nodes
public class LeftHandSight {
//print all the elements which you can see from left hand side
	
	static int levelSoFar = 0;
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		printLeftElements(root, 0);
	}
	private static void printLeftElements(Node root, int currentLevel) {
		if(root == null) return;
		
		if(currentLevel>=levelSoFar) {
			System.out.println(root.key);
			levelSoFar++;
		}
		printLeftElements(root.left, currentLevel+1);
		printLeftElements(root.right, currentLevel+1);
	}
}
