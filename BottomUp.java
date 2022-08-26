import java.util.*;
public class BottomUp
{
	public static void main(String[] args) {
		int[] arr={1,2,5};
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		int i,j;
		int[] a=new int[amt+1];
		a[0]=0;
		a[1]=1;
		for(i=2;i<a.length;i++){
		    int min=amt+1;
		    for(j=0;j<arr.length;j++){
		        if(amt==arr[j]){
		            System.out.println(1);
		            return;
		        }
		        int c=1;
		        int t=i-arr[j];
		        if(t>0){
		        c+=a[t];
		        }
		        if(c<min && t>=0){
		            min=c;
		        }
		    }
		    a[i]=min;
		}
	    System.out.println(a[amt]);
	}
}
