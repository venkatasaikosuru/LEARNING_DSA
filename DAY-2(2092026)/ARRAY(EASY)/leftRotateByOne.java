// thoughproces for this problem is 

// int first = arr[0]
// int[] temp = new int[arr.length]
// for(int i = 1 ----> n)
// {
// 	temp[i-1] = arr[i]
// }

// for(int j = 0---->n)
// {
// 	arr[j] = temp[j]
// }

// arr[n-1] = first

// for(int x : arr)
// {
// 	print(x) ---------------> we ,may get left rotate array by one..
// }

import java.util.*;
class leftRotateByOne
{
	void rotateArray(int[] arr)
	{
		// int first = arr[0];

		// int[] temp = new int[arr.length];

		// for (int i = 1;i<arr.length;i++) {
				
		// 		temp[i-1] = arr[i];
		// }

		// for (int j = 0;j<temp.length ;j++) {

		// 	arr[j] = temp[j];
			
		// }

		// arr[arr.length-1] = first;

		int first = arr[0];

	    for (int i = 1; i < arr.length; i++) {
	        arr[i - 1] = arr[i];
	    }

	    arr[arr.length - 1] = first;
	}


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements one by one : ");
		for (int i = 0;i<n;i++) {


			arr[i] = sc.nextInt();
			
		}

		leftRotateByOne obj = new leftRotateByOne();
		obj.rotateArray(arr);


		for(int x : arr)
		{
			System.out.print(x+" ");
		}

		

		
		
	}
}