package javastart;

public class parameterised_cons {
int id;
String name;
parameterised_cons(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id + " " +name);
}
public static void main(String[] args)
{
	parameterised_cons p=new parameterised_cons(1,"akanksha");
	p.display();
}
}
