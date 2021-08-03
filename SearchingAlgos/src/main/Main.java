package main;

import java.util.Arrays;

import main.algorithms.BinarySearch;
import main.algorithms.JumpSearch;
import main.algorithms.SequentialSearch;

public class Main {
	public static void main(String[] args) {
		int [] inputArray = {7,34,1,23,0,87,4,5};
		int key  = 87;
		System.out.println(SequentialSearch.search(inputArray, key));
		System.out.println(SequentialSearch.optimizedSearch(inputArray, key));
		Arrays.sort(inputArray);
		System.out.println(Arrays.toString(inputArray));
		System.out.println(BinarySearch.searchIterative(inputArray, key));
		System.out.println(BinarySearch.searchRecursive(inputArray, key));
		System.out.println(JumpSearch.search(inputArray, key));
		
	}	
}
