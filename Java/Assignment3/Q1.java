import java.util.Scanner;
class Search{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[8];
		System.out.println("Enter array elements:-");
		for(int i=0;i<8;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter item to search:-");
		int key=sc.nextInt();
		int check=0;
		int pos=0;
		for(int i=0;i<8;i++)
		{
			if(arr[i]==key)
			{
				 pos=i;
				check=1;
				break;
			}
			
		}
		if(check==0)
			System.out.println("Element not found");
		else
			System.out.println("Element present at "+ pos);
		
	}
}