import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class LIS {
	// Iterative function to find the longest increasing subsequence
	// of a given array
	public static void findLIS(int[] arr) {
		// base case
		if (arr == null || arr.length == 0) {
			return;
		}
		// LIS[i] stores the longest increasing subsequence of subarray
		// `arr[0…i]` that ends with `arr[i]`
		List<List<Integer>> LIS = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			LIS.add(new ArrayList<>());
		}
		// LIS[0] denotes the longest increasing subsequence ending at `arr[0]`
		LIS.get(0).add(arr[0]);
		// start from the second array element
		for (int i = 1; i < arr.length; i++) {
			// do for each element in subarray `arr[0…i-1]`
			for (int j = 0; j < i; j++) {
				// find the longest increasing subsequence that ends with `arr[j]`
				// where `arr[j]` is less than the current element `arr[i]`
				if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
					LIS.set(i, new ArrayList<>(LIS.get(j)));
				}
			}
			// include `arr[i]` in `LIS[i]`
			LIS.get(i).add(arr[i]);
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (LIS.get(j).size() < LIS.get(i).size()) {
				j = i;
			}
		}
		// print LIS
		System.out.print(LIS.get(j));
	}

	public static void main(String args[]) {
		int size;
		Scanner sc = new Scanner(System.in);
		// Reading the size of array..
		System.out.println("Enter the size of array which is less than 100 : ");
		size = sc.nextInt();
//Declaring the array with input size..
		int arr[] = new int[size];
		// Reading the array elements...
		System.out.println("Enter the elements in array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// calling the static method..
		findLIS(arr);
	}
}
