interface Trans
{
void status();
}
 
public class Staticmethod {
public static void msgStatus()
{
System.out.println("static method reference...");
}
public static void main(String[] args) throws Exception{
Trans t = Staticmethod::msgStatus;
t.status();
}
}
