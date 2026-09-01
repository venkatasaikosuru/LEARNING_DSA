import java.util.*;
class Hashing
{

	void fetchandstore(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		int n = arr.length;
		int[] hash = new int[n];
		for (int i = 0;i<n;i++) {

			hash[arr[i]] += 1;
			
		}
		System.out.println("Eneter now of choices : ");
		int q = sc.nextInt();
		while(q-->0)
		{
			System.out.println("Eneter the you want to fetch : ");
			int number = sc.nextInt();

			System.out.println("The frequency of Number "+number+"is : "+hash[number]);
		}
	}

	void hashmap(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		int n = arr.length;

		HashMap<Integer , Integer> hash = new HashMap<>();
		for (int i = 0;i<n;i++) {

			int number = arr[i];

			hash.put(number,hash.getOrDefault(number ,0)+1);
			
		}

		for (int j = 0;j<hash.size() ;j++) {

			if(hash.get(j)==1)
			{
				hash.remove(j);
			}
			
		}

		// System.out.println("Eneter now of choices : ");
		// int q = sc.nextInt();
		// while(q-->0)
		// {
		// 	System.out.println("Eneter the you want to fetch : ");
		// 	int number = sc.nextInt();

		// 	System.out.println(hash.getOrDefault(number ,0));
		// }

	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,1,4,5,6,2,1,8,1,6};
		Hashing obj = new Hashing();
		// obj.fetchandstore(arr);
		obj.hashmap(arr);
		for (int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}