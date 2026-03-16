package Assginments;

public class findSecondLargets {

	public static void main(String[] args) {

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		// int[] ds = { 10, 5, 20, 8 };
		int[] ds = { 20, 20, 10 };

		for (int i = 0; i < ds.length; i++) {

			if (ds[i] > largest) {
				secondlargest = largest;
				largest = ds[i];

			} else if (ds[i] > secondlargest && ds[i] != largest) {
				secondlargest = ds[i];
			}

		}
		System.out.println(secondlargest);

	}

}
