package com.basicjava;

public class Pothan {

//	int= datatypes
//	id= veriable

	// veriable
	 private int id;
	 private String name;

	// default constructed
	public Pothan() {

	}

	void m1(int id ,String name) {

	}

	public Pothan(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Pothan(int id, String name, double fee) {
		this.id = id;
		this.name = name;

	}
	public static void main(String[] args) {
		Pothan p  = new Pothan(10, "sai");
		System.out.println(p);
		System.out.println(p.id);
		System.out.println(p.name);

	}

}
