/* Java program to show the usage of Outer Class and "Non-static Nested class" and their object creation

Object creation is different for Non_Static_Nested_Class

The best advantage of using the concept Nested class

1)	Grouping of data of related class.
2)	Code optimization
3)	Less usage of memory because we can use the variable of Outer class, as you can see it is a kind of parent-child relationship where OuterClass is parent and InnerClass is child and we know child can access parent variable and methods but parent can't.
4)	To increase encapsulation.
5)	Increase readability and maintainability of code as it is closer to where it is used. 


Reference Link below


*/


class OuterClass
{
	int a=100,c=300;
	
	void output()
	{
		//input();		//method of OuterClass can't refer to method of InnerClass because 
		//for OuterClass, 'input method' doesn't exist because it is  a kind if super/parent class and in java parent don't have access to child class, no jump in hierarchy is accepted.
		System.out.println("This is OuterClass method ");
	}
	
	void get()
	{
		System.out.println("This is OuterClass 'get method' ");
	}
	
	class InnerClass
	{
		int b=200; 		
		
		void input()
		{
			System.out.println("This is InnerClass 'input method' ");
			
			System.out.println("value of variable 'a' of OuterClass called by InnerClass 'input method' = "+a);		//variable of InnerClass can refer/call to variable of OuterClass but reverse can't happen
			
			output();		//method of InnerClass can refer/call to method of OuterClass but reverse can't happen
			
			System.out.println("value of variable 'b' ,InnerClass variable = "+b);
		
			System.out.println("value of variable 'c' of OuterClass called in InnerClass 'input method' = "+c);	 
			
			get();		  
		}
		
	}
}

class Non_Static_Nested_Class
{
	public static void main(String args[])
	{
		OuterClass o=new OuterClass();						//OuterClass object is 1st created 
		OuterClass.InnerClass obj= o.new InnerClass();		//InnerClass object created in different way  in comparison to static Nested class 
		
		obj.input();
		
		
	}
}
