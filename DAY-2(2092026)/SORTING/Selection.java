import java.util.*;
class Selection
{

	void selectionSort(int[] arr,int n)
	{

		for (int i = 0;i<n;i++ ) {

			int min = i;

			for (int j = i+1;j<n;j++ ) {


				if(arr[j]<arr[min])
				{
					min = j;
				}
				
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
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

		Selection obj = new Selection();
		obj.selectionSort(arr , n);


		for (int i = 0;i<n;i++) {

			System.out.println(arr[i]);
			
		}

	}
}