
public class Pig implements Animal {

	
	FoodType foodType;
	int calories;
	int meatCounter = 0;
	int plantCounter = 0;
	
	public Pig(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		this.calories = calories;
	}
	
	@Override
	public void eat(FoodType foodType, int calories) {
			this.calories = this.calories + calories;
			System.out.println("The Pig just ate " + calories + " calories worth of " + foodType + "\n");
			if (foodType == FoodType.Meat) {
				this.meatCounter = this.meatCounter + calories;
			}
			if (foodType == FoodType.Plants) {
				this.plantCounter = this.plantCounter + calories;
			}
			isSated(foodType, calories);

		
	}

	@Override
	public boolean isSated(FoodType foodType, int calories) {
		if (this.calories >= 3000 && meatCounter >= 1000 && plantCounter >= 1000) {
			System.out.println("This Pig is fully fed.\n");
			return true;
		} else {
			System.out.println("This Pig still needs " + (3000 - this.calories) + " more calories to be fully fed!");
			System.out.println("   -> Specifically, they also need  at least " + (1000 - meatCounter) + " more calories from meat.");
			System.out.println("   -> They also require " + (1000 - plantCounter) + " more calories from plants.\n");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Pig foodType: " + foodType + ", calories: " + calories;
	}
	
	

}
