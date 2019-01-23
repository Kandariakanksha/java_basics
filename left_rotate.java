package javastart;

import java.util.Scanner;

public class left_rotate {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int []a=new int[100];
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();	
	}
	int z=a[0];
	for(int i=1;i<n;i++)
	{
	  a[i-1]=a[i];
	}
	a[n-1]=z;
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
