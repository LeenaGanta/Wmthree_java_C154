package sorts;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args)
	   {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter no. of elements:");
		  int n=sc.nextInt();
		  int []arr=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("Enter number:");
			  arr[i]=sc.nextInt();
		  }
		 // int arr[]= {12,43,2,1,4};
		  //int n=arr.length;
		  BubbleSort bubble=new BubbleSort();
		  bubble.bubbleSort(arr,n);
		  System.out.print("Sorted elements using Bubble Sort are:");
		  bubble.display(arr,n);  
		  
		  System.out.println();
		  
		  SelectionSort selection=new SelectionSort();
		  selection.selectionSort(arr, n);
		  System.out.print("Sorted elements using Selection Sort are:");
		  selection.display(arr, n);
		  
	}
}
