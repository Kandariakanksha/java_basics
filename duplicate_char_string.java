package javastart;

import java.util.Scanner;

public class duplicate_char_string {
	public static void main(String[] srgs)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char []a=str.toCharArray();
		int c=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=' ')
				{
					c++;
					a[j]='0';
				}
			}
			if(c>1 && a[i]!='0')
			{
				System.out.println(a[i]);
			}
			c=1;
		}
		
	}
	}

