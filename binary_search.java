package javastart;

import java.util.Scanner;

public class binary_search {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n+1];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt(); // array has to be sorted
	}
	int z=sc.nextInt();
	int first=a[0];
	int f=0;
	int last=a[n-1];
	int mid=(first+last)/2;
	while(first<=last)
	{
		if(z<a[mid])
		{
			last=mid-1;
		}
		else if(z==a[mid])
		{
		  f=1;
		  System.out.println("number found at" + mid);
		  break;
		}
		else
		{
			first=mid+1;
		}
		mid=(first + last)/2;
	   }
	if(first>last)
	{
		System.out.println("number not found");
	}
}
}
