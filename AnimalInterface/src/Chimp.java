
public class Chimp implements Animal {

	FoodType foodType;
	int calories;
	int meatCounter;
	
	public Chimp(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		this.calories = calories;
		if (foodType == FoodType.Meat) {
			this.meatCounter = this.meatCounter + calories;
		}
	}
	
	@Override
	public void eat(FoodType foodType, int calories) {
		this.calories = this.calories + calories;
		System.out.println("The Chimp just ate " + calories + " calories worth of " + foodType + ".");
		if (foodType == FoodType.Meat) {
			this.meatCounter = this.meatCounter + calories;
		}
		isSated(foodType, calories);
		
	}

	@Override
	public boolean isSated(FoodType foodType, int calories) {
		if (this.calories >= 1000 && meatCounter >= 200) {
			System.out.println("This Chimp is fully fed.\n");
			return true;
		} else {
			System.out.println("This Chimp still needs " + (1000 - this.calories) + " more calories to be fully fed!");
			System.out.println("   -> Specifically, they also need at least " + (200 - meatCounter) + " more calories from meat.\n");
			return false;
		}
	}

}
