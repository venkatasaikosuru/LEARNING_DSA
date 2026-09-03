import java.util.*;
class LinearSearch
{
	boolean searchElement(int key , int[] arr)
	{
		int n = arr.length;
		for (int i = 0;i<n;i++ ) {

			if(key==arr[i])
			{
				return true;
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