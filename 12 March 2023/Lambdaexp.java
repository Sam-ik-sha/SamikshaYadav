@FunctionalInterface
interface In1
{
public int calc(int p,int g);
}
public class Lambdaexp {
public static void main(String[] args) throws Exception{
int c=99;
/*
* In1 i1 = new In1() {
*
* @Override public void show() { System.out.println(c);
*
* } }; i1.show();
*/
/*
* In1 i1 = (eName)->{ return "Hi..."+eName; };
* System.out.println(i1.show("VEERA")); In1 i2 = eName->{ return
* "Welcome.."+eName; }; System.out.println(i2.show("YADAV"));
*/
//In1 i1 = (p,q)->(p*q+5);
//System.out.println(i1.calc(6, 7));
In1 i2 = (w,d)->
{
return w+d;
};
System.out.println(i2.calc(3, 6));
}
}
