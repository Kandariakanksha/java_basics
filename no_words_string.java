package javastart;

import java.util.Scanner;

public class no_words_string {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				c++;
			}
		}
		System.out.println(c+1);
	}
	
}
