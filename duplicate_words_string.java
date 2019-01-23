package javastart;

import java.util.Scanner;

public class duplicate_words_string {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toLowerCase();
	String[] words=str.split(" ");
	int c=1;
	for(int i=0;i<words.length;i++)
	{
		c=1;
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]) && words[i]!="0")
			{
				c++;
				words[j]="0";
			}
		}
		if(c>1 && words[i]!="0")
		{
			System.out.println(words[i]);
		}
	}
}
}
