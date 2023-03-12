interface In1{
	void m1();
}
public class Instancemethod {
	public void calc()
	{
		System.out.println("Calling..");
	}
	public static void main(String[] args) 
	{
		Instancemethod a=new Instancemethod();
		In1 i1=a::calc;//non-static method using reference
		i1.m1();
		In1 i2=new  Instancemethod()::calc;//non-static Anonymous class object/instance method calling
		i2.m1();
	}

}
