package javastart;

import java.util.Scanner;

public class factorial {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=1;
	while(n>0)
	{
		sum=sum*n;
		n--;
	}
	System.out.println(sum);;
}
}
