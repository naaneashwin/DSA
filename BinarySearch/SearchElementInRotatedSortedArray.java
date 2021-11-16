package BinarySearch;

public class SearchElementInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = {4,5,6,9,88,0,1,2,3};
		int target = 0;
		System.out.println(search(arr,target));
	}
	public static int search(int[] arr, int target) {
        //corner condition
        if(arr.length ==1 && target==arr[0]) return 0;
        else if(arr.length == 1 && target != arr[0]) return -1;
        
        //non rotated array
        if(arr[0]<arr[arr.length-1]) return bSearch(arr, target, 0, arr.length-1);
        
        int pivotIndex = pivotFinder(arr);
        
        if(arr[pivotIndex]==target || pivotIndex==-1) return pivotIndex;
        
        if(arr[pivotIndex]<target && target<=arr[arr.length-1])
        	
        	return bSearch(arr, target, pivotIndex, arr.length-1);
        
        else
        	
        	return bSearch(arr, target,0, pivotIndex);
            
    }
    private static int pivotFinder(int[] arr){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid==0 && arr[mid]<arr[high]) return mid;
            
            else if(mid==arr.length-1 && arr[mid]>arr[low])return mid;
            
            else if(mid != arr.length-1 && arr[mid+1]<arr[mid]) return mid+1;
            
            else if(mid!= 0 && arr[mid]<arr[mid-1]) return mid;
            
            else if(arr[mid]<arr[high]) high = mid-1;
            
            else if(arr[mid]>arr[low]) low = mid+1;
        }
        return -1;
    }
    private static int bSearch(int[] arr , int target, int low, int high){
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]==target) return mid;
                else if(arr[mid]<target) low = mid+1;
                else high = mid-1;
            }
            return -1;
    }
}
