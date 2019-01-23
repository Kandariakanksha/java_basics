package javastart;

import java.util.Scanner;

public class upper_triangle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		m=sc.nextInt();
		n=sc.nextInt();
		int [][]a=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();	
			}	
		}
		System.out.println("total matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				{
					System.out.print(a[i][j]+ " ");
				}
			}
		}
}
}
