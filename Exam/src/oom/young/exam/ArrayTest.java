package oom.young.exam;

public class ArrayTest {
	public static void main(String[] args)

	{

		int[] array = { 4, 5, 6, 7, 8, 12 };
		int[] array2 = new int[10];

		String[] array3 = new String[5];

		String str1 = new String("하나");

		array3[0] = str1;
		array3[1] = "둘";

		int[] array5 = { 4, 5, 6, 7, 8, 12 };
		printArrayValue(array);

		int[] arr2 = { 10, 20 };
		printArrayValue(arr2);
	}

	public static void printArrayValue(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

	public static void printArrayValue(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("합계 : " + sum + "입니다.");
		System.out.printf("합계 : %d입니다.", arr);

		for (int sadf : arr) {
			System.out.println(sadf);
			sum += sadf;
		}
	}
}
