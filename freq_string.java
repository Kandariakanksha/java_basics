package javastart;

import java.util.Scanner;

public class freq_string {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int c=0;
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
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
			System.out.println(str.charAt(i) + " " + c);
			f=0;
			c=0;
		}
}
}
