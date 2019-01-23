package javastart;

import java.util.Scanner;

public class frequency_array {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int c=0,f=0;
 int []a=new int[100];
 for(int i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
 }
 for(int i=0;i<n;i++)
 {
	 for(int j=0;j<n;j++)
	 {
		 if(a[j]==a[i])
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
	 if(f==0)
	 System.out.println(a[i] + " " + c);
	 c=0;
	 f=0;
 }
}
}
