import java.util.Scanner;
class Gcd{
	public static void main(String s[])
	{
		int l = s.length;
		if(l!=2)
			System.out.println("Wrong Input");
		int temp;
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println("The GCD is " +a);
}
}