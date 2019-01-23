package javastart;

import java.util.Scanner;

public class reverse_print {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=0,sum=0;
    while(n>0)
    {
    	r=n%10;
    	n=n/10;
    	sum=sum*10+r;
    }
    System.out.println(sum);
}
}
