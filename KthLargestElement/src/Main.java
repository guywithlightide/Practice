import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		int [] arr = {45,6,78,2,32};
		int k=1;
		Map<Integer, Integer> numVFreq = new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			Integer z = numVFreq.get(arr[i]);
			if(z==null)
				numVFreq.put(arr[i], 1);
			else
				numVFreq.put(arr[i], z++);
		}
		int total = 0;
		int number = arr[0];
		boolean largest = true;
		boolean elementsNeeded = true;
		int [] elements = new int[k];
		int z=0;
		for(int num : numVFreq.keySet())
		{
			total+=numVFreq.get(num);
			number = num;
			if(!largest)
			{
				if(total>=k)
				{
					break;				
				}
			}
			else
			{
				if(total >= arr.length-k+1)
				{
					break;
				}
			}
			if(elementsNeeded)
				elements[z++] = number;
		}
		System.out.println(k+(largest?" largest":" smallest")+" element is "+number);
		System.out.println(Arrays.toString(elements));
	}

}
