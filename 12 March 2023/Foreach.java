import java.util.HashSet;
import java.util.Set;
public class Foreach {
 public static void main(String[] args)throws Exception{
Set<String> s = new HashSet<>();
s.add("python");
s.add("oracle");
s.add("mongodb");
s.add("java");
s.add("aws");
s.forEach ((n)->System.out.println(n));
 }
}
