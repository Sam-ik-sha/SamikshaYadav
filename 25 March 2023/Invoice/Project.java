package com.Lowes;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Project {
	private int pid;
	private String pName;
	private Map<String, String> mgr; 
	public void setPid(int pid) { 
		this.pid =pid;
	}
public void setpName(String pName) { 
	this.pName = pName;
}
public void setMgr(Map<String, String> mgr) { 
	this.mgr= mgr;
}

public void disp() {
System.out.println("Project Id.."+pid);
System.out.println("Project Name.."+pName); 
System.out.println("Manager details ."); 
Set<Entry<String,String>> s=mgr.entrySet();
Iterator<Entry<String, String>> i = s.iterator();
while(i.hasNext())
{
	Entry<String,String> e=i.next();
	System.out.println("Mgr id"+e.getKey()+"Mgr Name"+e.getValue());
}
}
}
