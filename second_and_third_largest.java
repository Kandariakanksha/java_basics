package javastart;

import java.util.Scanner;

public class second_and_third_largest {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[100];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[j]<a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(a[1] + " " +a[2]);
	
}
}
