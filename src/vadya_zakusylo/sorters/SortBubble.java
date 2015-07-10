package vadya_zakusylo.sorters;

import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {
		int[] array = { 15, 2, 20, 17, 3, 65, 42 };
		for (int indexFirst = 0; indexFirst < array.length - 1; indexFirst++) {
			for (int indexSecond = 0; indexSecond < array.length - 1 - indexFirst; indexSecond++) {
				if (array[indexSecond] > array[indexSecond + 1]) {
					swap(array, indexSecond);
				}
			}
		}
		System.out.println(Arrays.toString(array));
		for (int indexFirst = array.length - 1; indexFirst >= 0; indexFirst--) {
			for (int indexSecond = array.length - 1; indexSecond > array.length - 1 - indexFirst; indexSecond--) {
				if (array[indexSecond] > array[indexSecond - 1]) {
					swap(array, indexSecond - 1);
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	private static void swap(int[] array, int i) {
		int k = array[i];
		array[i] = array[i + 1];
		array[i + 1] = k;
	}

}
