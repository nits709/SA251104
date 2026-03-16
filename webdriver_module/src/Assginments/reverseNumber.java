package Assginments;

public class reverseNumber {

	public static void main(String[] args) {
		int revn = 12345;

		String neVe = String.valueOf(revn);

		for (int i = neVe.length() - 1; i >= 0; i--) {
			System.out.println(neVe.charAt(i));
		}
	}
}
