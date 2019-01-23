package javastart;

import java.util.Scanner;

public class largest {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[100];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int largest=a[0];
	for(int i=0;i<n;i++)
	{
		if(largest<a[i])
		{
			largest=a[i];
		}
	}
	System.out.println(largest);
}
}
