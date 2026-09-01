// 1.Print numbers from n to 1 (space separated) without the help of loops.
// Examples :

// Input: n = 10
// Output: 10 9 8 7 6 5 4 3 2 

// 2.You are given two numbers n and p. You need to find np.

// Examples:

// Input: n = 9, p = 9 
// Output: 387420489
// Explanation: 9 raised to power 9 is 387420489.
// Input: n = 2, p = 9
// Output: 512
// Explanation: 2 raised to power 9 is 512.

// 3.Sum of first N Natural Numbers
// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

// Examples
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

// Input: N=6
// Output: 21
// Explanation: 1+2+3+4+5+6=15

// 4.Factorial of a Number : Iterative and Recursive

// Problem Statement: Given a number X,  print its factorial.

// To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

// Note: X  is always a positive number. 

// Examples
// Example 1:
// Input:
//  X = 5
// Output:
//  120
// Explanation:
//  5! = 5*4*3*2*1

// Example 2:
// Input:
//  X = 3
// Output:
//  6
// Explanation:
//  3!=3*2*1

// 5.Reverse a given Array

// Problem Statement: You are given an array. The task is to reverse the array and print it.

// Examples
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

import java.util.*;
class Recursion
{


    void printNos(int n) {
        // code here
        if(n==0)
        {
           return;
        }

       
        System.out.print(n+" ");
        
        printNos(n-1);
        
    }
   int recursivePower(int n, int p) {
        // code here
        if(p==0)
        {
            return 1;
        }
        
        return n*recursivePower(n,p-1);
    }

    int sumofN(int n )
    {
    	if(n==0)
    	{
    		return 0;
    	}

    	return n+sumofN(n-1);
    }
    int factOfN(int n )
    {
    	if(n==0)
    	{
    		return 1;
    	}

    	return n*factOfN(n-1);
    }


    static void reverseArray(int[] arr , int left ,int right )
    {
    	if(left>=right)
    	{
    		return;
    	}

    	int temp = arr[left];
    	arr[left] = arr[right];
    	arr[right] = temp;

    	reverseArray(arr,left+1,right-1);
    }

    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range you want : ");
		// int n = sc.nextInt();
		// int p = sc.nextInt();
		Recursion obj = new Recursion();

		int[] arr = {1,2,3,4,5};

		int left = 0;
		int right = arr.length-1;
		reverseArray(arr,left , right);
		for (int i = 0;i<arr.length;i++ ) {

			System.out.print(arr[i]+" ");
			
		}
		// obj.printNos(n);
		// System.out.println(obj.recursivePower(n , p)); // beacuse n^p....

		// System.out.print(obj.sumofN(n));
		// System.out.println(obj.factOfN(n));
	}
}