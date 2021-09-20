//To show the usage of abstract class and abstract method with inheritance (Three CLASSES only)in java


abstract class A
{
	abstract void input();
	
	void output()								// This method is only accessible to "class B" object only.
	{
		System.out.println("This is regular method of class A");
	}
	
}

abstract class B extends A
{
	abstract void get();
	void disp()
	{
		System.out.println("This is method of class B");
	}
	
	//As class B is also abstract therefore no one has access to "class A" void output() method. So, it is a waste here but definitely maintains a hierarchy. 
}

class C extends B
{
	void input()
	{
		System.out.println("This is overriden method of class A in class C");
	}
	
	void get()
	{
		System.out.println("This is overriden method of class B in class C");
	}
	
}

class Abstract_Main2
{
	public static void main(String args[])
	{
		C obj=new C();
		
		obj.get();
		obj.input();
		//obj.output();			// you cannot call class A method with class C object because class C object will be jumping the hierarchy which is not allowed in java.
								// If program run, then it will show error "void output() method not declared" because class C object can access only class B methods and variables. 
		obj.disp();
		
	}
}