import java.util.*;
public class WordGame
{
	public static void main(String[] args) {
		System.out.println("enter the array element (enter as a string without ',')");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] myArr=s.toCharArray();
		int n=myArr.length;
		int len=n;
		int c=1;
		for(int i=0;i<n;i=(i+1)%n){
	        if(myArr[i]!='*'){
		    if(c%4==0 || c%10==4){
		    if(len==1){
		       System.out.println(myArr[i]);
		       break;
		    }
		        myArr[i]='*';
		        
		        len--;
		    }
		    c++;
		}
		}
		    
		
	}
}
