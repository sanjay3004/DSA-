import java.util.*;
public class Recursive
{
    static int count=0;
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of coin..");
	    int n=sc.nextInt();
	    int[] a= new int[n];
	    System.out.println("Enter the coins one by one: ");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println("Enter the amount");
	    int amt=sc.nextInt();
	    System.out.print("The combinations are ");
	    recSort(a,amt,a.length-1);
	    System.out.println("and the count is "+count);
	}
	
	static void recSort(int[] a,int amt,int last){
        if(amt==0){
            return ;
        }
        int q=amt/a[last];
        count+=q;
	    amt%=a[last];
	    for(int i=0;i<q;i++){
	        System.out.print(a[last] +" ");
	    }
	    recSort(a,amt,last-1);
	}
}

