package vadya_zakusylo.sorters;

import java.util.Arrays;

public class SortInsertion {

	public static void main(String[] args) {
		int[] a = { 5, 3, 5, 6, 8, 9, 10, 2, 1, 6, 3 };
		for (int index = 1; index < a.length; index++) {
			int workedValue = a[index];
			int prevIndex = index - 1;
			while (prevIndex >= 0 && a[prevIndex] > workedValue) {
				a[prevIndex + 1] = a[prevIndex];
				a[prevIndex] = workedValue;
				prevIndex--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}