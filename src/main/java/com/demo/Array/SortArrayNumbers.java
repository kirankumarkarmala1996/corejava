package com.demo.Array;

import java.util.Arrays;

public class SortArrayNumbers {
	public static void main(String[] args) {
		int []arr= new int[] {10,2,1,11,22,55};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
