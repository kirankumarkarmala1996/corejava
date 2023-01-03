package com.imterface;

public class Sai implements Room {

	@Override
	public void hall() {
		System.out.println("10th class");
		
	}

	@Override
	public void kitchen() {
		System.out.println("store room");
	}

	@Override
	public void bedRoom() {
		System.out.println("play area");
		
	}

	@Override
	public void bathRoom() {
		System.out.println("bathing");
		
	}
	public static void main(String[] args) {
		Sai s = new Sai();
		s.bathRoom();
		s.bedRoom();
		s.hall();
		s.kitchen();
		System.out.println("===============");
		
	}

}
