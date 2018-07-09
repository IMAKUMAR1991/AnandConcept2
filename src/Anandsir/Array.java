package Anandsir;

public class Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 8, 1, 3, 4 };
		int count = 0;
		for (int i = 0; i < a.length; i++)

		{
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j] + " kool " + a[j]);

				}
			}

		}
	}

}
