import java.util.*;
class MergeSort
{
	static void merge(int arr[], int l, int m, int r)
	{
	
		int n1 = m - l + 1;
		int n2 = r - m;

		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];


		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[m + 1 + j];

		int i = 0, j = 0;

	
		int k = l;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], int left, int right)
	{
		if (left < right) {
		
			int mid =left+ (right-left)/2;

		
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}


	static void print(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the total number of element");
	    int no=sc.nextInt();
	    int arr[] = new int[no];
	    for(int i=0;i<no;i++){
	        arr[i]=sc.nextInt();
	    }

		System.out.println("Given Array");
		print(arr);

		sort(arr, 0, no - 1);

		System.out.println("\nSorted array");
		print(arr);
	}
}
