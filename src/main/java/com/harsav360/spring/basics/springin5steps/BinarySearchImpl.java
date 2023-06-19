package com.harsav360.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	public int binarySearch(int[] numbers,int number)
	{
		BubbleSortAlgorithm  bSort = new BubbleSortAlgorithm();
		int[] result = bSort.sort(numbers);
		System.out.println(result);
		return 3;
	}

}
