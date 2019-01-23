package javastart;

import java.util.Scanner;

public class frequency_evenandoddnumber_matrix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		int k=0,c=0;
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
				if(a[i][j]%2==0)
				{
					c++;
				}
				else
				{
					k++;
				}
			}
		}
		System.out.println("odd " + k );
		System.out.println("even " + c);
}
}
