package javastart;
class Ad
{
	static int method(int a,int b)
	{
		return a+b;
	}
	static double method(double a,double b)
	{
		return a+b;
	}
}
public class methodoverloading_bychangind_datatype {
	public static void main(String[] args)
	{
System.out.println(Ad.method(2,2));
System.out.print(Ad.method(2.4,3.4));
	}

}
