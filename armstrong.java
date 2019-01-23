package javastart;

import java.util.Scanner;

public class armstrong {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n,sum=0;
	n=sc.nextInt();
	int temp=n;
	while(n>0)
	{
		int r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if(sum==temp)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not armstrong");
	}
}
}
