package javastart;

import java.util.Scanner;

public class pattern2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>0;j--)
		{
			if(i!=j)
			{
				System.out.print(j + " ");
			}
			else
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
}
}
