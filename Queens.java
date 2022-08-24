import java.util.*;
public class Queens {
	static int N ;
	static void print(int chess[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + chess[i][j]
								+ " ");
			System.out.println();
		}
	}

	static boolean check(int chess[][], int r, int c)
	{
		int i, j;
    	for (i = 0; i < c; i++)
			if (chess[r][i] == 1)
				return false;
    	for (i = r, j = c; i >= 0 && j >= 0; i--, j--)
			if (chess[i][j] == 1)
				return false;

		for (i = r, j = c; j >= 0 && i < N; i++, j--)
			if (chess[i][j] == 1)
				return false;

		return true;
	}
	static boolean move(int chess[][], int c)
	{
		if (c >= N)
			return true;

		for (int i = 0; i < N; i++) {
			if (check(chess, i, c)) {
				chess[i][c] = 1;
				if (move(chess, c + 1) == true)
					return true;

				chess[i][c] = 0;
			}
		}
		return false;
	}


	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows ");
        N=sc.nextInt();
		int chess[][]=new int[N][N];
		if (move(chess, 0) == false) {
			System.out.print("Solution does not exist");
			}

		print(chess);
	}
}

