package sorting;

import java.util.Arrays;

public class Bubble<T extends Comparable<? super T>> {

	public static int[] sortElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public T[] sortElementsGeneric(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j+1])==1) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Bubble<Integer> bubble = new Bubble<Integer>();
		Integer[] arr = { 13, 32, 26, 35, 10 };
		Bubble<String> bubbleString = new Bubble<String>();
		String[] arr1 = {"","21","3","rahul"};
		Bubble<Double> doubleBubble = new Bubble<Double>();
		Double[] dArr = {98.1d,88d,14d,23.5d};
		System.out.println(Arrays.toString(bubble.sortElementsGeneric(arr)));
		System.out.println(Arrays.toString(bubbleString.sortElementsGeneric(arr1)));
		System.out.println(Arrays.toString(doubleBubble.sortElementsGeneric(dArr)));
		// left small then -1
		System.out.println("Output :- "+("2").compareTo("22"));
	}
}
