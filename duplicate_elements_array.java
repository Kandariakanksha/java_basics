package javastart;

import java.util.Scanner;

public class duplicate_elements_array {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int []a=new int[100];
	int []b=new int[100];
	int f=0,k=0;
	int c=0;
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();	
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				if(j<i)
				{
					f=1;
					break;
				}
				else
				{
					c++;
				}
			}
		}
		if(c>1 && f==0)
		{
			System.out.println(a[i]);
		}
		f=0;
		c=0;
	}
	for(int i=0;i<k;i++)
	{
		System.out.print(b[i] + " ");
	}
}
}
