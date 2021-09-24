package sorts;

/* 
 * Best Complexity: O(n)
 * Worst Complexity:O(n2)
 * Average Complexity:O(n2)
 * Auxiliary Space:O(1)
 */

import java.util.Scanner;

public class BubbleSort
{
   void bubbleSort(int arr[],int n)
   {
	   int i,j,temp;
	   boolean swapped=false;
	   for(i=0;i<n-1;i++)
	   {
		   for(j=0;j<n-i-1;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   swapped=true;
			   }
		   }
		   if(swapped==false)
			   break;
	   }   
   }
   void display(int arr[],int n)
   {
	   for(int i=0;i<arr.length;i++)
	    System.out.print(arr[i]+" ");
   }
   
}


