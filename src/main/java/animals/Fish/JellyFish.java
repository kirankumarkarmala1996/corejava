package animals.Fish;

public class JellyFish extends Fish {

	private String fishname;

	public JellyFish() {
	this.fishname="Round jellyFish ";
	}

	
	public String showInfo() {
		return "JellyFish [fishname=" + fishname + ", color=" + color + ", height=" + height + ", weight=" + weight
				+ ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}

	
	
	
	
	
	
}
