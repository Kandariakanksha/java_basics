package javastart;

import java.util.Scanner;

public class smallest {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[100];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int smallest=a[0];
		for(int i=0;i<n;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}
}
