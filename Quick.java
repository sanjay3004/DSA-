import java.util.*;
class Quick{
    public static void main(String[] args) {
       System.out.println("How many elements do you want to add: ");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       quickSort(a,0,a.length-1);
       print(a);
    }
    
    static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
    }
    static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
}

    static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}


