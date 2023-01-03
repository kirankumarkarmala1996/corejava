package com.imterface;

import com.demo.Corejava.Mahesh;

public class Kiran  implements Room{

	@Override
	public void hall() {
		System.out.println("dancing");
		
	}

	@Override
	public void kitchen() {
		System.out.println("cooking");
		
	}

	@Override
	public void bedRoom() {
		System.out.println("reading");
	}

	@Override
	public void bathRoom() {
		System.out.println("washing");
		
	}
	
	private void hello() {
		System.out.println("");
	}
	
	
	

}
