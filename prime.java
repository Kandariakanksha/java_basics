package javastart;

import java.util.Scanner;

public class prime {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int f=0;
	if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
	else
	{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			f=1;
			break;
		}
	}
	}
	if(f==1)
	{
		System.out.println("not prime");
	}
	else
	{
		System.out.println("prime");
	}
}
}
