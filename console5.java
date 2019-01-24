package javastart;

import java.util.Scanner;

public class console5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==1  || i==n)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("1");
				}
			}
			else
			{
				for(int k=1;k<=n;k++)
				{
					if(k==1 || k==n)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
