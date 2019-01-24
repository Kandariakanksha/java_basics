package javastart;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			for(int j=i;j<=n/2;j++)
			{
				if(i==j)
			System.out.print(j);
				else
					System.out.println(" ");
			}
		}
	}
}
