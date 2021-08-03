package main.algorithms;

public class SequentialSearch {
		
	public static int search(int [] array, int key) {
		for(int i=0;i<array.length;i++) {
			if(key == array[i])
				return i;
		}
		return -1;
	}
	
	public static int optimizedSearch(int [] array, int key) {
		int left = 0, right = array.length-1;
		for(left=0;left<=right;left++,right--) {
			if(key == array[left])
				return left;
			else if(key == array[right])
				return right;							
		}
		return -1;
	}
}
