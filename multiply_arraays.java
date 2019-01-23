package javastart;

import java.util.Scanner;

public class multiply_arraays {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		m=sc.nextInt();
		n=sc.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		int [][]c=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();	
			}	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=0;
				for(int k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
