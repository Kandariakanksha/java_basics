package javastart;
class Adder{  
static int add(int a,int b){return a+b;}          //static ...so that we dont need to crete instance for calling methods
static int add(int a,int b,int c){return a+b+c;}  
}  
class method_overloading{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  

