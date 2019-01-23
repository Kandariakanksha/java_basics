package javastart;

import java.util.Scanner;

public class selection_sort {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=0,small=0,index=0,temp1=0;
	int a[]=new int[n+1];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		temp=a[i];
		small=a[i+1];
		for(int j=i+1;j<n;j++)
		{
			if(small>a[j])
			{
				small=a[j];
				index=j;
			}
		}
		if(small<temp)
		{
			temp1=a[index];
			a[index]=a[i];
			a[i]=temp1;
		}
		temp1=0;
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
