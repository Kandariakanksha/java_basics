package javastart;

import java.util.Scanner;

public class fibonacci {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    int n,i=0;
    int sum=0;
    int a=0,b=1;
    n=sc.nextInt();
    System.out.print(a + " ");
    System.out.print(b + " ");
   while(i<=n-1)
   {
	  sum=a+b;
	   System.out.print(sum + " ");
	   a=b;
	   b=sum;
	   i++;
   }
}
}
