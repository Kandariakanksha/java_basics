package javastart;

import java.util.Scanner;

public class check_one_string_is_rotation_of_another {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String str2=sc.nextLine();
	if(str2.length()!=str.length())
	{
		System.out.println("not possible");
	}
	str=str.concat(str);
	if(str.indexOf(str2)!=-1)
	{
		System.out.println("part of it");
	}
	else
	{
		System.out.println("not part of it");
	}
}
}
