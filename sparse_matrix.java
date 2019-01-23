package javastart;

import java.util.Scanner;

public class sparse_matrix {
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
		int c=0,k=0,f=0;
		if(m!=n)
		{
			System.out.println("matrix has to be square");
		}
		else
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i][j]==0)
					{
						c++;
					}
				}
			}
			if(c>(m*n)/2)
			{
				System.out.println("sparse matrix");
			}
			else
			{
				System.out.println("not sparse matrix");
			}
		}
		
}
}
