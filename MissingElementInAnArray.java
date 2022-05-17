package assignments2.week1day2;

public class MissingElementInAnArray {
	public int MissingNumber(int[] arr) {

		int length = arr.length;
		System.out.println("Length of array is " + length);
		int sum = ((length + 1) * (length + 2)) / 2;

		for (int i = 0; i < length; i++)
		{
			sum -= arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		MissingElementInAnArray a = new MissingElementInAnArray();
		int missingElement = a.MissingNumber(arr);
		System.out.println("Missing Element is " + missingElement);
	}

}
