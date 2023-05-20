package animals.Birds;

import com.animals.Animal;

public class Bird extends Animal {
	private String color;

	public Bird() {
		this.color = "blue";
		height = 1;
		weight = 1.2f;
		AnimalType = "bird";
		BloodType = "cold";

	}

	@Override
	public String toString() {
		return "Bird [color=" + color + ", height=" + height + ", weight=" + weight + ", AnimalType=" + AnimalType
				+ ", BloodType=" + BloodType + "]";
	}

	

}
