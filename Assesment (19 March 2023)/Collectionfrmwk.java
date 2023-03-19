import java.util.*;
public class Collectionfrmwk {
	public static void main(String[] args){
		
	    System.out.println("                                                                       ");
		 System.out.println("/////////////////////////////////   Treeset    //////////////////////////////////////////////");
		 System.out.println("                                                                       ");
	      TreeSet<String> treeset = new TreeSet<String>();
	      treeset.add("BMW");
	      treeset.add("Toyota");
	      treeset.add("Volvo");
	      //Add Duplicate Element
	      treeset.add("BMW");
	      System.out.println("TreeSet : ");
	      for (String temp : treeset) {
	         System.out.println(temp);  
	      }
	      
		    System.out.println("                                                                       ");
		    System.out.println(" /////////////////////////////////   Hashset    //////////////////////////////////////////////");
		    System.out.println("                                                                       ");
	      HashSet<String> hashSet = new HashSet<String>();
	      hashSet.add("AUDI");
	      hashSet.add("BMW");
	      hashSet.add("TATA");
	      //Add Duplicate Element
	      hashSet.add("AUDI");
	      System.out.println("HashSet: ");
	      for (String temp : hashSet) {
	         System.out.println(temp);
	      }
	      
	      System.out.println("                                                                       ");
		    System.out.println(" /////////////////////////////////   ArrayList    //////////////////////////////////////////////");
		    System.out.println("                                                                       "); 
	      
	  	List<String> l = new ArrayList<>();
		l.add("BMW");
		l.add("Ford");
		l.add("Tesla");
		l.add("Porsche");
		l.add("Jeep");
		System.out.println(l);
		Collections.addAll(l,"Audi","Kia","Volvo");
		System.out.println("After adding collection");
		System.out.println(l);
		String sarr[]= {"Honda","TATA"};
		Collections.addAll(l,sarr);
		System.out.println("After adding array obj ");
		System.out.println(l);
		
	      
		    System.out.println("                                                                       ");
		    System.out.println(" /////////////////////////////////   TreeMap    //////////////////////////////////////////////");
		    System.out.println("                                                                       ");
	  	TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();   
		tmap.put(1,"BMW"); 
		tmap.put(3,"Audi");    
	    tmap.put(2,"Maruti");    
	    tmap.put(4,"Honda"); 
	    for(Map.Entry<Integer,String> m:tmap.entrySet()){    
	    	System.out.println(m.getKey()+" "+m.getValue());  
	    	}    
	    //Maintains descending order  
	    System.out.println("descendingMap: "+tmap.descendingMap());  
	    //Returns key-value pairs whose keys are less than or equal to the specified key.  
	    System.out.println("headMap: "+tmap.headMap(2,true));  
	    //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	    System.out.println("tailMap: "+tmap.tailMap(2,true));  
	      
	    
	    
	    System.out.println("                                                                       ");
	    System.out.println(" /////////////////////////////////   HashMap    //////////////////////////////////////////////");  
	    System.out.println("                                                                       ");
	    HashMap<Integer,String> hmap=new HashMap<Integer,String>();//Creating HashMap    
		   hmap.put(1,"Maruti");  //Put elements in Map  
		   hmap.put(4,"Kia");    
		   hmap.put(3,"TATA");   
		   hmap.put(2,"BMW");   
		   hmap.put(23, null);
		   hmap.put(null, "Alto");
		   hmap.put(null, "Alto");
		   //ALLOWS BOTH NULL VALUES BUT ONLY ONE NULL KEY
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry<Integer,String> m : hmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
		   hmap.remove(100);  
		    System.out.println("Updated list of elements: "+hmap);
		    
		    hmap.replace(1, "Maruti", "PORSCHE");  
		    System.out.println("After replacing....");
		     for(Map.Entry<Integer,String> m:hmap.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }   
		     
		     
		     System.out.println("                                                                       ");
			 System.out.println("//////////////////////////////  HashTable   //////////////////////////////////////");
			 System.out.println("                                                                       ");

			  Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
			  htable.put(1, "BMW");
			  htable.put(3, null);
			  htable.put(null, "TATA");
			   System.out.println(htable);   //doesn't allow null key values at all
			      
			  
			  
		}  
	   }
