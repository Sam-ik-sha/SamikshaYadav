import java.util.ArrayList;
import java.util.Collections;
//import java.util.Enumeration;
import java.util.List;
//import java.util.Vector;

public class CollectionList {
public static void main(String[] args) {
	List<String> l = new ArrayList<>();
	l.add("rohit");
	l.add("chetana");
	l.add("disha");
	l.add("arya");
	l.add("sneha");
	System.out.println(l);
	Collections.addAll(l,"yadav","anthara","jaspriya");
	System.out.println("After adding collection");
	System.out.println(l);
	String sarr[]= {"gorika","priya"};
	Collections.addAll(l,sarr);
	System.out.println("After adding array obj ");
	System.out.println(l);
}
}
