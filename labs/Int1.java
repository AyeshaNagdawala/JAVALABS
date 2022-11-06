class Int1{
		public static void main(String args[])
		{
			// creating Object
			A a=new M();
			a.a();
			a.b();
			a.c();
			a.d();
	}
}

interface A{
	void a();
	void b();
	void c();
	void d();
}
class M implements A{
	public void a() 
	{
		System.out.println("I am a");
	}
	public void b()
	{
		System.out.println("I am b");
	}
	public void c()
	{
	System.out.println("I am c");
	}
	public void d()
	{
		System.out.println("I am d");
	}
}
