package intro;

public class ArrayEx {

	public static void main(String[] args) {

		int arr1[] = new int[10];
		
		arr1[3] = 45;

		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 56, 6, 7, 7, 7, 87 };

		int[] arr3 = { 1, 1, 3, 3, 4, 5, 65, 6, 6, 6, 3 };
		
		for(int i = 0 ; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		
	}

}
