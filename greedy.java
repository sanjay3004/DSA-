import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] coin={5,2,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int totVal=sc.nextInt();
		int i,j,val=totVal;
		System.out.print("The combination is ");
        for(i=0;i<coin.length;i++){
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
