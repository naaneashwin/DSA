package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//T.C O(N^4)//for DFS
public class AverageOfLevelInBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(2147483647);
		root.left = new Node(2147483647);
		root.right = new Node(2147483647);
		//root.right.right = new Node(7);
		//root.right.left = new Node(15);
		
		//DFS
		List<Double> li = new ArrayList<>();
		int h = getHeight(root);
		for(int i=0; i<=h; i++) {
			double avg = 0;
			List<Double> ll = new ArrayList<>();
			getList(root, i, ll);
			avg = averager(ll);
			li.add(avg);
		}
		for(int i=0; i<li.size(); i++) {
			System.out.print(li.get(i) + " ");
		}
		
		//BFS T.c O(N^2)
		List<Double> returner = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;
            for(int i=0; i<n; i++){
                Node temp = q.poll();
                sum += (double)temp.key;
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            returner.add(sum/n);
        }
        //print the elements if needed
        
    }

	private static int getHeight(Node root){
        if(root == null) return -1;
        
        int x = getHeight(root.left);
        int y = getHeight(root.right);
        
        return 1+Math.max(x,y);
    }
	private static void getList(Node root,int level, List l) {
		if(root == null ) return;
		
		if(level == 0) {
			l.add((double)root.key);
		}
		level--;
		getList(root.left, level, l);
		getList(root.right, level, l);
	}
	private static double averager(List<Double> l) {
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<l.size(); i++) {
			sum += l.get(i);
		}
		avg = sum/l.size();
		return avg;
	}
}

