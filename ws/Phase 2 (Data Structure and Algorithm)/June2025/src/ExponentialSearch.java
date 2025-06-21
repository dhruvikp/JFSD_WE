
public class ExponentialSearch {

	public static void main(String[] args) {
		int[] arr = {7,1,9};
		int key = 7;
		int length = arr.length;
		binarySearch(arr, 0, key, length);
	}

	
	public static void binarySearch(int[] arr, int start, int key, int length) {
		
		int mid = (start+length)/2;
		
		while(start <= length) {
			
			if(arr[mid] < key) {
				start = mid + 1;
			} else if(arr[mid] == key) {
				System.out.println("Element is found at index :"+ mid);
				break;
			} else {
				length = mid-1;
			}
			mid = (start+length)/2;
		}
	
	}
}
