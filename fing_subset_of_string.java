package javastart;

import java.util.Scanner;

public class fing_subset_of_string {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int len=str.length();
	int temp=0;
	String arr[]=new String[(len*(len+1))/2]; //total number of subsets possible in a strting
	for(int i=0;i<len;i++)
	{
		for(int j=i;j<len;j++)
		{
			arr[temp]=str.substring(i,j+1);  //substring khud mil jayega
			temp++;
		}
	}
	for(int i=0;i<temp;i++)
	{
		System.out.println(arr[i]);
	}
}
}
