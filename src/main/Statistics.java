package main;

/**
 * This is a collection of utilities to compute various statistics on arrays of
 * integers.
 * 
 * @author cbourke
 *
 */
public class Statistics {

	/**
	 * Computes the sum of the given elements.
	 * 
	 * @param array
	 * @return
	 */
	public static int getSum(int array[]) {
		// TODO: implement
		return 0;
	}

	/**
	 * Computes the mean (average) of the given elements.
	 * 
	 * @param array
	 * @return
	 */
	public static double getAverage(int array[]) {
		if (array == null || array.length < 1)
			return 0;
		int sum = getSum(array);
		return sum / (double) array.length;
	}

	/**
	 * Computes the minimal element in the given array of
	 * integers.
	 * 
	 * @param array
	 * @return
	 */
	public static int getMin(int array[]) {
		if (array == null || array.length == 0)
			return 0;
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	//TODO: add documentation
	public static int getMax(int array[]) {
		// TODO: implement
		return 0;
	}
}
