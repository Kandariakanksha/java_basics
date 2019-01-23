package javastart;

import java.util.Scanner;

public class linear_search {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n+1];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int f=0;
	int z=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(z==a[i])
		{
			f=1;
			break;
		}
	}
	if(f==1)
	{
		System.out.println("found");
	}
	else
	{
		System.out.println("not found");
	}
}
}
