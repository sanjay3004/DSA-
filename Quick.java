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
     int j = (end-1);
     int i=begin;
     while (i<j){
         while(arr[i]<pivot && i<end){
             i++;
         }
         while(arr[j]>=pivot && j>begin){
             j--;
         }
         if(i<j){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
     }
     if(pivot<arr[i]){
         int temp=arr[i];
         arr[i]=arr[end];
         arr[end]=temp;
     }
    return i;
    
}

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

