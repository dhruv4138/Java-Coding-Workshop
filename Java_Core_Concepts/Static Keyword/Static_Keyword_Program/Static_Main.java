// Java Program to show Static keyword usage

/*Program consist concept of
	1)	Instance Variable
	2)	Class Variable
	3)	static constructor (not allowed)
	4)	static method
	5)	static variable
	6)	Use of "super" and "this" keyword in child class within static method (not allowed)
	7)	Use of "super" and "this" keyword in child class with normal/regular method (allowed)
	8)	static method can only call other static variable and method
	9)	Accessing static variable and method via class object
	10)	Accessing static variable and method via class name (without object)

*/
 
//Reference for concept clarity : https://www.geeksforgeeks.org/static-keyword-java/

class A
{
	int a=150,b;  			//Instance Variable 
	
	static int c=100;		// Class Variable 
	
	
	/*static A()		//static constructor not allowed
	{
		System.out.println("This is the example of Static Constructor ");
	}*/
	
	static void input()
	{
		System.out.println("This is the example of Static Method of class A ");
	}
}
class B extends A
{
	int a=100;
	
	static void disp() 
	{
		//super.input(); 	//can't use 'super' and 'this' keyword here because this method is static method/class method 
		
		//System.out.println("Value of a = " +super.a);  //prohibited or illegal reason just above
		
		
		//---------------------
		
		
		System.out.println("This is the example of Static Method of class B");
		
		System.out.println("Value of static variable 'c' of class A = " +c);		//static method can call only static variable of parent and child class  
		
		System.out.println("calling Static Method of class A via Static Method of class B "); 
		
		input();	//static method can call only static method of parent and child class 	
	}
	
	void output()
	{
		
		System.out.println("This is the example of non-Static Method of class B");
		
		super.input();
		
		System.out.println("Value of a of class A : " +super.a);
		System.out.println("Value of a = " +this.a);
		System.out.println("Value of c of class A : " +super.c);
	}
}
class Static_Main
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp();
		obj.input();
		obj.output();
		
		A obj1=new A();
		obj1.input();		// we can also call static method with object of class.
		
		//A.c;	//need print statement to print like below
		
		System.out.println("Value of C = " +A.c);	// calling static variable(Class Variable ) of class A without object i.e. via "class name dot variable name".
		
		
		A.input();			// calling static method(Class method) of class A without object i.e. via "class name dot method name"
		
	}
}