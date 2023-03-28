package com.Lowes;
import java.util.List;
import java.util.Iterator;
public class Invoice{
private int eid;
private String eName;
private List<String> seminars;
public Invoice(int eid, String eName, List<String> seminars) {
super();
this.eid=eid;
this.eName = eName;
this.seminars = seminars;
}
public void disp() {
System.out.println("Eid.... "+eid+" EName...."+ eName); 
System.out.println("Programs Conducted...... ");
Iterator<String> i =seminars.iterator(); 
while(i.hasNext()) {
System.out.println(i.next());
}
}
}