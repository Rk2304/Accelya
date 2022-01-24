package com.controlflow;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][] = { { 1, 2, 5 }, { 5, 4, 5 }, { 7, 3, 4 } };
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		for (int[] i : arr) {
//			for (int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

		int[][][] arr1 = { { { 3, 4, 5 }, { 4, 2, 1 } }, { { 4, 6, 2 }, { 5, 1, 5 } } };

		for (int[][] i : arr1) {
			for (int[] j : i) {
				for(int k : j) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
