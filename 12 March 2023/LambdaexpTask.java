@FunctionalInterface
interface In1
{
	public int calc(int x, int y);
}
	interface In2
	{
		public int calc(int p, int r,int t);
	}
interface In3
{
	public double calc(double a);
	
}
public class LambdaexpTask {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		In1 rectarea = (int x,int y) ->(x*y); 
		In2 si=(int p,int r, int t) ->((p*r*t)/100);
		In3 areacircle=(double a)->((3.14)*a*a);
			   System.out.println("Area of rectangle "+ rectarea.calc(9,7));
			   System.out.println("Simple Interest "+ si.calc(90,7,3));
			   System.out.println("Area of circle "+ areacircle.calc(9));
	}
}


