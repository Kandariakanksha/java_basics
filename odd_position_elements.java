package javastart;

import java.util.Scanner;

public class odd_position_elements {
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
		if(i%2==1)
		{
			System.out.println(a[i]);
		}
	}
	
}
}
