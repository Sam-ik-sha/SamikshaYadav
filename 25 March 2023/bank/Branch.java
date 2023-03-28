package com.Lowes;

public class Branch {
private int brId;
private String loc;
public Branch() {
}
public Branch(int brId, String loc) {
	super();
	this.brId = brId;
	this.loc = loc;
}
public void setBrId(int brId) {
	this.brId = brId;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Branch [brId=" + brId + ", loc=" + loc + "]";
}
}

