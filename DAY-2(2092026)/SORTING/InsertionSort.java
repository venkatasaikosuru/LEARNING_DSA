
import java.util.*;
class InsertionSort
{
	void Insertion(int[] arr)
	{
		for (int i = 0;i<arr.length ;i++ ) {

			int j = i;
			while(j>0&&arr[j-1]>arr[j])
			{
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;


				j--;
			}
			
		}
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

			InsertionSort obj = new InsertionSort();
			obj.Insertion(arr);


		for (int i = 0;i<n;i++) {

			System.out.println(arr[i]);
			
		}

	}
}