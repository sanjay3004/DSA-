import java.util.*;

class Quick {
   
   static int flag=0;

	static void CombinationRepetitionUtil(int chosen[], int arr[],
			int index, int r, int start, int end,int amt) {

		if (index == r) {
		    int sum=0;
			for (int i = 0; i < r; i++) {
				sum+=arr[chosen[i]];
			}
			if(sum==amt){
			    for(int i=0;i<r;i++){
			    System.out.printf("%d ", arr[chosen[i]]);
			    flag=1;
			    }
			}
			return;
		}

        if(flag==1){
            return;
        }
		for (int i = start; i <= end; i++) {
			chosen[index] = i;
			CombinationRepetitionUtil(chosen, arr, index + 1,
					r, i, end,amt);
		}
		return;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] = {1, 2, 5};
		int n = arr.length;
		int r = 1;
		
		int amt;
		System.out.println("Enter the amount: ");
		amt=sc.nextInt();
		while(flag==0){
		int chosen[] = new int[r + 1];
		CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1,amt);
		r++;
		}
	}
}
