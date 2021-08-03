package main.algorithms;

public class JumpSearch {
	
	public static int search(int [] array, int key) {
		int len = array.length;
		int jump = (int) Math.sqrt(len);
		int i=0;
		while (key>=array[Math.min(i,len-1)] && i<len) {
			i+=jump;
		}
		for(i=i-jump;i<Math.min(i+jump, len);i++)
		{
			if(array[i]==key)
				return i;
		}
		return -1;
	}

}
