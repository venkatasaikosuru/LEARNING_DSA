import java.util.*;
class LargestAnsSecondLargest
{
	int largest(int[] arr)
	{
		int largest = 0;
		for (int i = 0;i<arr.length;i++) {


			int j = i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;

				j--;
			}
		
		}

		largest = arr[arr.length-1];


		return largest;
	}

	int secondLargest(int[] arr)
	{
		int largest = arr[arr.length-1];
		int secondlargest = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]!=largest && arr[i]>secondlargest)
			{
				secondlargest = arr[i];
			}
		}


		return secondlargest;
	}


public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements one by one : ");
		for (int i = 0;i<n;i++) {

			arr[i] = sc.nextInt();
			
		}

			LargestAnsSecondLargest obj = new LargestAnsSecondLargest();
			System.out.println("The largest element is : "+obj.largest(arr));
			System.out.println("The secondlargest element is : "+obj.secondLargest(arr));
			



	}
}