
public class Wolf implements Animal {

	FoodType foodType;
	int calories;
	int eatCounter;
	
	
	
	
	public Wolf(FoodType foodType, int calories) {
		super();
		this.foodType = foodType;
		if (foodType == FoodType.Meat) {
			this.calories = calories;
		}
	}
	@Override
	public void eat(FoodType foodType, int calories) {
		if (foodType == FoodType.Meat) {
			System.out.println("The Wolf just ate " + calories + " calories worth of " + FoodType.Meat + ".");
			this.calories = this.calories + calories;
			eatCounter++;
			isSated(foodType, calories);
		} else {
			System.out.println("Wolves can only eat meat, they do not eat " + foodType + ".\n");
		}
	}
	
	@Override
	public boolean isSated(FoodType foodType, int calories) {
		if (this.calories >= 800 && eatCounter >= 4) {
			System.out.println("This wolf is fully fed.\n");
			return true;
		} else if (this.calories >= 800 && eatCounter < 4){
			System.out.println("This Wolf needs to eat 0 more calories.");
			System.out.println("They also need to eat " + (4 - eatCounter) + " more times to be sated.\n");
			return false;
		} else if (this.calories < 800 && eatCounter < 4) {
			System.out.println("This Wolf needs " + (800 - this.calories) + " more calories.");
			System.out.println("They also need to eat " + (4 - eatCounter) + " more times to be sated.\n");
		} else if (this.calories < 800 && eatCounter >= 4) {
			System.out.println("This Wolf needs " + (800 - this.calories) + " more calories.");
			System.out.println("They need to eat 0 more times to be sated.\n");
		}
		return false;
	}
	
	
	
	
}
