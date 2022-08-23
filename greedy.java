import java.util.*;
public class Greedy
{
	public static void main(String[] args) {
		int[] coin={5,1,2};
		Arrays.sort(coin);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int totVal=sc.nextInt();
		int i,j,val=totVal;
		System.out.print("The combination is ");
        for(i=coin.length-1;i>=0;i--){
            if(val>0){
                int count=val/coin[i];
                for(j=0;j<count;j++){
                    System.out.print(coin[i] + " ");
                }
                val%=coin[i];
            }
        }      		
		
	}
}
