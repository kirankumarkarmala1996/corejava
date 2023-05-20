package animals.Fish;

import com.animals.Animal;

public class Fish extends Animal {
	protected String fishName;
	protected String color;

	public Fish() {
		this.fishName="shark fish";
		this.color = "gray";
		height = 2;
		weight = 2f;
		AnimalType = "Tom fish";
		BloodType = "cold fish";

	}

	public String showInfo() {
		return "Fish [fishName=" + fishName + ", color=" + color + ", height=" + height + ", weight=" + weight
				+ ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}

}
