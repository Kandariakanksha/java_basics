package javastart;
class operation
{
	int square(int r)
	{
		return r*r;
	}
}
public class aggregation {
	double pi=3.14;
	operation op=new operation();
	double area(int radius){  

		   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		   return pi*rsquare;  
		 }  
public static void main(String[] args)
{
	aggregation a=new aggregation();
	int radius=4;
	double result=a.area(radius);
	System.out.print(result);
}
}
