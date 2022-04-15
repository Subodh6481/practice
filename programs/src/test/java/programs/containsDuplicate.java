package programs;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,0,1,2};


		System.out.println(containsDuplicatee(arr));
		System.out.println(containsDuplicateHashSet(arr));


	}

	private static Boolean containsDuplicateHashSet(int[] arr) {

		HashSet<Integer> numbers= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {

			if(numbers.contains(arr[i])){
				return true;
			}
			numbers.add(arr[i]);

		}

		return false;
	}





	private static Boolean containsDuplicatee(int[] arr) {

		Arrays.sort(arr);

		for(int i=0;i<arr.length-1;i++) {

			if(arr[i]==arr[i+1]) {
				//System.out.println("Duplicate found");

				return true;
			}



		}

		return false;
		//System.out.println("Duplicate NOT found");


	}

}
