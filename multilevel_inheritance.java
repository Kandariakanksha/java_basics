 package javastart;
class dog
{
	void bark()
	{
		System.out.println("barking");
	}
}
class cat extends dog
{
	void meow()
	{
		System.out.println("barking");
	}
}
class kutta extends cat
{
	void ku()
	{
		System.out.println("barking barking");
	}
}
public class multilevel_inheritance {
	public static void main(String[] args)
	{
   kutta k=new kutta();
   k.ku();
   k.meow();
	}
}
