package main.algorithms;

public class BinarySearch {

	public static int searchIterative(int [] array, int key) {
		int left = 0;
		int right = array.length-1;
		int mid = (right-left)/2;
		while(left<=right)
		{
			if(array[mid] == key)
				return mid;
			else if(array[mid] > key)
			{
				right = mid-1;				
			}
			else
			{
				left = mid+1;
			}
			mid = (right+left)/2;
		}
		return -1;
	}
	
	public static int searchRecursive(int [] array, int key) {
		return search(array, 0, array.length,key);
	}
	
	public static int search(int [] array, int left, int right, int key) {
		int mid = (left+right)/2;
		if(left<=right)
		{
			if(array[mid] == key)
				return mid;
			
			if(array[mid] > key)
				return search(array, left, mid-1, key);
			
			return search(array, mid+1, right, key);			
		}
		return -1;
	}
	
}
