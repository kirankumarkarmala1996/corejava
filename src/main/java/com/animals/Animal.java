package com.animals;

public class Animal {
	protected int height;
	protected float weight;
	protected String AnimalType;
	protected String BloodType;

	public Animal() {
		this.height=0;
		this.weight=0;
		this.AnimalType="unknow";
		this.BloodType="unknow";
		
	}

	public String showOf() {
		return "Animal [height=" + height + ", weight=" + weight + ", AnimalType=" + AnimalType + ", BloodType="
				+ BloodType + "]";
	}
	 

}
