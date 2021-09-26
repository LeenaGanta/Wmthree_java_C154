package sorts;
/*
 * Best Case Complexity: O(n2)
 * Average Case Complexity: O(n2)
 * Worst Case Complexity: O(n2)
 * Auxiliary Space: O(1)
 */

public class SelectionSort 
{
	static void selectionSort(int arr[],int n)
	{
		int min_idx,temp;
		for(int i=0;i<n-1;i++)
			{
				min_idx=i;
				for(int j=i+1;j<n;j++)
				{
					if(arr[min_idx]>arr[j])
						min_idx=j;
				}
				temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
	}
	static void display(int arr[],int n)
	   {
		   for(int i=0;i<arr.length;i++)
		    System.out.print(arr[i]+" ");
	   }

}
