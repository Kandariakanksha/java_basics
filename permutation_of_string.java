package javastart;

import java.util.Scanner;

public class permutation_of_string {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		str=str.replaceAll(" ", "");
	}
	System.out.println(str);
}
}
