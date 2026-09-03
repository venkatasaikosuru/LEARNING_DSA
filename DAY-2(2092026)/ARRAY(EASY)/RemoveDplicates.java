
//4.Remove dupliactes from array.
import java.util.*;
class RemoveDplicates
{
	int removeElements(int[] arr)
	{
		int i = 0;
		for (int j = 1;j<arr.length ;j++ ) {

			if(arr[i]!=arr[j])
			{
				arr[i+1] = arr[j];
				i++;
			}
			
		}


		return i;
	}


	public static void main(String[] args) {
		

		System.out.println("Note: For removing duplicates array must be sorted , check array is not sorted then sort it first after that remove duplicates");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements one by one : ");
		for (int i = 0;i<n;i++) {


			arr[i] = sc.nextInt();
			
		}

		RemoveDplicates obj = new RemoveDplicates();
		obj.removeElements(arr);
		int newLength = obj.removeElements(arr);

		for(int j = 0;j<newLength;j++)
		{
			System.out.println(arr[j]);
		}
	}
}