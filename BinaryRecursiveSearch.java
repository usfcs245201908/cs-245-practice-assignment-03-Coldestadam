public class BinaryRecursiveSearch implements Practice03Search{

	public String searchName(){
		return "Binary Recursive Search";
	}

	public int search(int[] arr, int target, int low, int high){
		if(low>high)
			return -1;
		int mid = (low + high)/2;
		if(arr[mid]==target)
			return mid;
		else if(arr[mid]<target){
			low=mid+1;
			return search(arr, target, low, high);
		}
		else{
			high=mid-1;
			return search(arr, target, low, high);
		}
	}

	public int search(int[] arr, int target){
		return search(arr, target, 0, arr.length);
	}
}