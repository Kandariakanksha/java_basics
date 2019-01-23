package javastart;

import java.util.Scanner;

public class copy_one_array_to_another {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[100];
	  int b[]=new int[100];
	  for(int i=0;i<n;i++)
	  {
		 a[i]= sc.nextInt();
	  }
	  for(int i=0;i<n;i++)
	  {
		  b[i]=a[i];
	  }
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(b[i]);
	  }
  }
}
