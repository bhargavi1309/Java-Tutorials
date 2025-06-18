import java.util.Scanner;
public class PalindromeNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int reverse=0;
		while(temp!=0)
		{
			int rev=temp%10;
			reverse=reverse*10+rev;
			temp/=10;
		}
		if(num==reverse)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palndrome Number");
		}
	}
}
