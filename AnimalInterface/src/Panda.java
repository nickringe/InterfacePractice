
public class Panda implements Animal {
	
	FoodType foodType;
	int calories;
	int plantCounter;
	
	public Panda(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		this.calories = calories;
			if (foodType == FoodType.Plants) {
				plantCounter = (calories / 2);
			}
	}
	
	@Override
	public void eat(FoodType foodType, int calories) {
		int halfCalories = (calories / 2);
		if (foodType == FoodType.Plants) {
			this.calories = this.calories + halfCalories;
			System.out.println("The Panda just ate " + calories + " calories worth of " + FoodType.Plants);
			isSated(foodType, (halfCalories));
		} else {
			System.out.println("Pandas can only eat plants, they do not eat " + foodType + ".\n");
		}

	}

	@Override
	public boolean isSated(FoodType foodType, int calories) {
		if (this.calories >= 3000) {
			System.out.println("This Panda is fully fed.\n");
			return true;
		} else {
			System.out.println("This Panda still needs " + (3000 - this.calories) + " more calories to be fully fed!");
			System.out.println("Their digestive system is very inefficient, so 50% of the calories they eat ");
			System.out.println("are not counted.\n");
			return false;
		}
	}
	
	

}
