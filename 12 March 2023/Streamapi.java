public class Streamapi{
int cid;
String cName;
int age;
public Streamapi(int cid, String cName, int age) {
 
this.cid = cid;
this.cName = cName;
this.age = age;
}
public static void main(String[] args) {
List<Streamapi> cl = new ArrayList<>();
cl.add(new Streamapi(1,"jaya",36));
cl.add(new Streamapi(2,"umesh",83));
cl.add(new streamapi(3,"raja",52));
cl.add(new streamapi(4,"amal",69));
/*
* List<Integer> ca = cl.stream().filter(c->c.age>70) .map(c->c.age)
* .collect(Collectors.toList()); System.out.println(ca);
*/
streamapi ca = cl.stream().max((c1,c2)->c1.age>c2.age?1:-1).get();
System.out.println("Senior ..."+ca.cid+" "+ca.cName+" "+ca.age);
streamapi ca1 = cl.stream().min((c1,c2)->c1.age>c2.age?1:-1).get();
System.out.println("Junior ..."+ca1.cid+" "+ca1.cName+" "+ca1.age); 
}
}
