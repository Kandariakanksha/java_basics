package javastart;

import java.util.Scanner;

public class transpose_array {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		m=sc.nextInt();
		n=sc.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();	
			}	
		}
		System.out.println("matrix before transpose");
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
				b[i][j]=a[j][i];
			}
		}
		System.out.println("matrix after transpose");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
}
}
