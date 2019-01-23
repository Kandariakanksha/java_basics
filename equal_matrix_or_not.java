package javastart;

import java.util.Scanner;

public class equal_matrix_or_not {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		m=sc.nextInt();
		n=sc.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();	
			}	
		}
		int c=0;
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
				if(a[i][j]==b[i][j])
				{
					c++;
				}
			}
		}
	if(c==(m*n))
	{
		System.out.println("equal matrix");
	}
	}
}
