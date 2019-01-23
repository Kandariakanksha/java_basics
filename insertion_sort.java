package javastart;

import java.util.Scanner;

public class insertion_sort {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n+1];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	 for (int j = 1; j < n; j++) {  
         int key = a[j];  
         int i = j-1;  
         while ( (i > -1) && ( a[i] > key ) ) {  
             a [i+1] = a[i];  
             i--;  
         }  
         a[i+1] = key;  
     }  
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
