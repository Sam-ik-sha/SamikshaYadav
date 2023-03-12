//import java.util.Enumeration;
import java.util.Vector;
 
public class CollectionVector {
public static void main(String[] args) {
Vector<String> v = new Vector<>();
v.add("java");
v.add("python");
v.add("angular");
v.add("react");
v.add("bootstrap");
v.add("java");
//v.add(3,"sql");
//v.setElementAt("html",2);
/*
* Enumeration<String> e = v.elements(); while(e.hasMoreElements()) {
* System.out.println(e.nextElement()); }
*/
System.out.println(v.size());
System.out.println(v.capacity()); 
}
}
