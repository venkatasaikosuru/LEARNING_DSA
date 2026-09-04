import java.util.*;
class LeftRotateByArray
{

	void rotateArray(int[] arr,int k)
	{
		int[] temp = new int[arr.length];
		int n = 0;
		for (int i = k;i<arr.length;i++ ) {

			temp[n] = arr[i];
			n++;
			
		}

		for (int j = 0;j<k;j++ ) {

			temp[n] = arr[j];
			n++;
			
		}

		for(int m = 0;m<temp.length;m++)
		{
			arr[m] = temp[m];
		}




	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the k value : ");
		int k = sc.nextInt();
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i=0;i<arr.length;i++) {

			arr[i] = sc.nextInt();
			
		}

		LeftRotateByArray obj = new LeftRotateByArray();
		obj.rotateArray(arr,k);

		for (int j=0;j<arr.length;j++) {

			System.out.print(arr[j]+" ");
			
		}



		
	}
}