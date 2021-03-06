
public class Bush implements Animal {

	FoodType foodType;
	int calories;
	int lightCounter;
	
	public Bush(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		this.calories = calories;
			if (this.foodType == FoodType.Light) {
				this.lightCounter = calories;
			}
	}
	
	@Override
	public void eat(FoodType foodType, int calories) {
		if (foodType == FoodType.Light) {
			this.calories = this.calories + calories;
			this.lightCounter = this.lightCounter + calories;
			System.out.println("The Bush just ate " + calories + " calories worth of " + FoodType.Light + "\n");
			isSated(foodType, calories);
		} else {
			System.out.println("Bushes can only eat Light, they do not eat " + foodType + ".\n");
		}
		
	}

	@Override
	public boolean isSated(FoodType foodType, int calories) {
		
		if (this.calories >= 50 && lightCounter >= 50) {
			System.out.println("This Bush is fully fed.\n");
			return true;
		} else {
			System.out.println("This Bush still needs " + (50 - this.calories) + " more calories to be fully fed!\n");
			return false;
		}
	}
	

}
