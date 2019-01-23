package javastart;

import java.util.Scanner;

public class vowel_consonents_string {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int c=0,b=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		{
			c++;
		}
		else
		{
			b++;
		}
	}
	System.out.println("no of vowels are " + c);
	System.out.println("no of consonents are " + b);
}
}
