package com.brainbeast.demos;

 class MyClass {

	String name;
	
	public MyClass(String name) {
	
	   this.name=name;
	}
	
	@Override
	public String toString() {
	
		return super.toString();
		//return  "MyClass object with name: " + name;
	}
	@Override
	public int hashCode() {
		//return super.hashCode();
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)  return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		MyClass myClass=(MyClass) obj;
		return name.equals(myClass.name);
	}
}
