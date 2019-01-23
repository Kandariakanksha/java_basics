package javastart;

import java.util.Scanner;

public class fibonacci_using_recursion {
	static int a=0,b=1,sum=0;
	static void printfibo(int n)
	{
		if(n>0)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum + " ");
			printfibo(n-1);
		}
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print(a + " " + b + " ");
	printfibo(n-2);
}
}
