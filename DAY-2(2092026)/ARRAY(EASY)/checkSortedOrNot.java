
//3.checks array is sorted or not .

import java.util.*;
class checkSortedOrNot
{

	boolean checkSort(int[] arr)
	{
		int count = 0;
		for (int i = 0;i<arr.length-1;i++ ) {

			if(arr[i]>arr[i+1])
			{
				count++;
			}
			


		}

		if(arr[arr.length-1]>arr[0])
		{
			count++;
		}

		return count<=1;
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

		checkSortedOrNot obj = new checkSortedOrNot();
		System.out.println(obj.checkSort(arr));

	}
}