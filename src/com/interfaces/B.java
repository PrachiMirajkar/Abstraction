package com.interfaces;
//interfaces have default, protected and static methods
//specifically contain abstract methods & static final variables
//constructor not allowed
//multiple inheritances is possible in case of Interfaces but not in case of class
//can not create object of interface
public class B implements  A{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is implementation");
	}
	public static void main(String[] args) {
		B b = new B();
		b.display();
		
	}

	
}
