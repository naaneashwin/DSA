package LinkedList;

public class MergeTwoSortedLists {
	int val ;
	MergeTwoSortedLists next;
	public MergeTwoSortedLists(int x) {
		val = x;
	}
	
	
	public static void main(String[] args) {
		MergeTwoSortedLists l1 = new MergeTwoSortedLists(1);
		MergeTwoSortedLists l2 = new MergeTwoSortedLists(2);
		MergeTwoSortedLists l3 = new MergeTwoSortedLists(3);
		l1.next = l2;
		l2.next = l3;
		
		MergeTwoSortedLists l4 = new MergeTwoSortedLists(1);
		MergeTwoSortedLists l5 = new MergeTwoSortedLists(3);
		MergeTwoSortedLists l6 = new MergeTwoSortedLists(5);
		l4.next = l5;
		l5.next = l6;
		
		Solution obj = new Solution();
		MergeTwoSortedLists mergedList = obj.mergeTwoLists(l1, l4);
		
		MergeTwoSortedLists pointer = mergedList;
		while(pointer != null) {
			System.out.print(pointer.val +" ");
			pointer = pointer.next;
		}
		
	}
}



class Solution {
    public MergeTwoSortedLists mergeTwoLists(MergeTwoSortedLists l1, MergeTwoSortedLists l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        MergeTwoSortedLists fakehead = new MergeTwoSortedLists(-101);
        MergeTwoSortedLists res = fakehead;
        
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                res.next = l1;
                l1 = l1.next;
            }
            else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        while(l1 != null){
            res.next = l1;
            res = res.next;
            l1= l1.next;
        }
        while(l2 != null){
            res.next = l2;
            res = res.next;
            l2 = l2.next;
        }
        return fakehead.next;
    }
}
