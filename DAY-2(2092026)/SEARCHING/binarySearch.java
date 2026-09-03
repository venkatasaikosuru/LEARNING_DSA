import java.util.*;
class binarySearch
{
	boolean searchElement(int key , int[] arr)
	{
		int low = 0;
		int high = arr.length-1;

		while(low<=high)
		{
			int mid = (low+high)/2;
			if(mid==key)
			{
				return true;
			}
			else if(mid>key)
			{
				low = mid+1;
			}
			else 
			{
				high = mid-1;
			}
		}

		return false;
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
		System.out.println("Enter the element you want to found : ");
		int key = sc.nextInt();

		LinearSearch obj = new LinearSearch();
		System.out.println(obj.searchElement(key , arr));
	}
}