// Java program to show the usage of Outer Class and "static Nested class" and their object creation
/*
Points to remember

Outer Class must not be static in any case.
Every class is a separate entity and can access other class variables and method i.e. in order of parent child relationship where child(Inner Nested class) can access variable and method of Outer Class but Outer Class can't access variable and method of Inner class.

Here Inner  class is static therefore entire thing is static 

*/

class OuterClass
{
	static int a=100;
	
	int c=300;
	
	static void output()
	{
		//input();		//static method of OuterClass can't refer to static method of InnerClass because 
		//for OuterClass input doesn't exist because it is  a kind if super/parent class and in java parent don't have access to child class, no jump in hierarchy is accepted.
		System.out.println("This is OuterClass method ");
	}
	
	void get()
	{
		System.out.println("This is non-static OuterClass method ");
	}
	
	static class InnerClass
	{
		
		static int b=200; 		
		
		static void input()
		{
			
			System.out.println("This is static InnerClass static method ");
			
			//System.out.println("value of static variable 'a' of static InnerClass static method = "+a);		//static method can't refer to non-static variable
			
			//disp();		//static method can't refer to non-static method
			
			output();		//static method of InnerClass can refer to static method of OuterClass but reverse can't happen
			
			System.out.println("value of static variable 'b' of static InnerClass static method = "+b);
		}
		
		void disp()
		{
			System.out.println("value of static variable 'a' of OuterClass called in InnerClass non- static method = "+a);	//allowed because InnerClass and variable 'a' of OuterClass are static.
			//System.out.println("value of static variable 'c' of OuterClass called in InnerClass non- static method = "+c);		// Not allowed because InnerClass is static 
			System.out.println("This is non-static InnerClass method ");
			
			//get();		// because of static Inner class can't execute but if static is removed then it will be executed because it is like child class and calling parent class method which is allowed   
		}
	}
}

class Static_Nested_Class
{
	public static void main(String args[])
	{
		OuterClass o=new OuterClass();
		o.output();
		//o.input();			// can't access InnerClass method with OuterClass object 
		
		OuterClass.InnerClass obj= new OuterClass.InnerClass();
		
		obj.disp();
		obj.input();
		
		
	}
}
