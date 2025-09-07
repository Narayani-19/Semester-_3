import java.util.Scanner;
class Addmat{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column:-");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		int m3[][]=new int[r][c];
		System.out.println("Enter elemnts of matrix 1:-");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				{
					m1[i][j]=sc.nextInt();
				}
		}
		System.out.println("Enter elemnts of matrix 2:-");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				{
					m2[i][j]=sc.nextInt();
				}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				{
					m3[i][j]=m1[i][j]+m2[i][j];
				}
		}
		System.out.println("The addition of two matrix is:-");
		for(int []i:m3)
		{
			for(int j:i)
				System.out.print(" "+j);
			System.out.println();
		}	
						
	}
}