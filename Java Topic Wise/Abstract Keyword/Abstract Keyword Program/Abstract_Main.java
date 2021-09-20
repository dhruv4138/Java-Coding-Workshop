//To show the usage of abstract class and abstract method with inheritance (TWO CLASSES only)in java

/*abstract class A
{
									// abstract class can be without an abstract method and regular method or without both
}*/
		//or 
		
abstract class A				// abstract class can be with an abstract method and regular method or with both
{
	abstract void input();			
	void output()
	{
		System.out.println("this  class A function");
	}
	
}
class B extends A
{
	void input()
	{
		System.out.println("this is abstract class function implementation");
		
	}
}

class Abstract_Main
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.input();
		obj.output();
	}
}

/*

Question- Why to create an abstract class without an abstract method and regular method or without both means an empty class?

Ans- Just to maintain the hierarchy of inheritance.

NOTE- abstract keyword cannot be used with variables and constructor. Not allowed in java.

*/