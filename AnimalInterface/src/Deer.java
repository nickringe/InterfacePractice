
public class Deer implements Animal {

	FoodType foodType;
	int calories;
	int plantCounter;
	
	
	
	public Deer(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		this.calories = calories;
			if (this.foodType == FoodType.Plants) {
				this.plantCounter = calories;
			}
	}

	public void eat(FoodType foodType, int calories) {
		if (foodType == FoodType.Plants) {
			this.calories = this.calories + calories;
			this.plantCounter = this.plantCounter + calories;
			System.out.println("The Deer just ate " + calories + " calories worth of " + FoodType.Plants + ".\n");
			isSated(foodType, calories);
		} else {
			System.out.println("Deer can only eat " + FoodType.Plants + ", they do not eat " + foodType + ".\n");
		}

	}
	
	public boolean isSated(FoodType foodType, int calories) {
		if (this.calories >= 1200 && plantCounter >= 1200) {
			System.out.println("This Deer is fully fed.\n");
			return true;
		} else {
			System.out.println("This Deer still needs " + (1200 - this.calories) + " more calories to be fully fed!\n");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Deer foodType: " + foodType + ", calories: " + calories;
	}

}
