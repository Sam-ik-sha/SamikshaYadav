package com.Lowes;

public class Customer {
private int cid;
private String cName;
private String eMail;
public Customer() {
	
}
public Customer(int cid, String cName, String eMail) {
	super();
	this.cid = cid;
	this.cName = cName;
	this.eMail = eMail;
}

public void setCid(int cid) {
	this.cid = cid;
}
public void setcName(String cName) {
	this.cName = cName;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cName=" + cName + ", eMail=" + eMail + "]";
}

}
