import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIsSated {

	@Test
	void DeerSatedTest() {
		Deer deer = new Deer(FoodType.Plants, 1200);
		assertTrue(deer.isSated(null, 0));
	}
	
	@Test
	void DeerSatedTest2() {
		Deer deer = new Deer(FoodType.Plants, 1000);
		deer.eat(FoodType.Plants, 200);
		assertTrue(deer.isSated(null, 0));
	}
	
	@Test
	void DeerNotSatedTest() {
		Deer deer = new Deer(FoodType.Plants, 1000);
		deer.eat(FoodType.Meat, 200);
		assertFalse(deer.isSated(null, 0));
	}
	
	@Test
	void DeerNotSatedTest2() {
		Deer deer = new Deer(FoodType.Light, 1200);
		assertFalse(deer.isSated(null, 0));
	}
	
	@Test
	void BushSatedTest() {
		Bush bush = new Bush(FoodType.Light, 10);
		assertFalse(bush.isSated(null, 0));
	}
	
	@Test
	void BushSatedTest2() {
		Bush bush = new Bush(FoodType.Light, 50);
		assertTrue(bush.isSated(null, 0));
	}
	
	@Test
	void BushSatedTest3() {
		Bush bush = new Bush(FoodType.Light, 40);
		bush.eat(FoodType.Light, 10);
		assertTrue(bush.isSated(null, 0));
	}
	
	@Test
	void BushNotSatedTest() {
		Bush bush = new Bush(FoodType.Light, 40);
		bush.eat(FoodType.Meat, 10);
		assertFalse(bush.isSated(null, 0));
	}
	
	@Test
	void BushNotSatedTest2() {
		Bush bush = new Bush(FoodType.Light, 40);
		bush.eat(FoodType.Light, 9);
		assertFalse(bush.isSated(null, 0));
	}
	
	@Test
	void BushNotSatedTest3() {
		Bush bush = new Bush(FoodType.Meat, 50);
		bush.eat(FoodType.Light, 9);
		assertFalse(bush.isSated(null, 0));
	}
	
	@Test
	void PigSatedTest() {
		Pig pig = new Pig(null, 0);
		pig.eat(FoodType.Light, 1000);
		pig.eat(FoodType.Meat, 1000);
		pig.eat(FoodType.Plants, 1000);
		assertTrue(pig.isSated(null, 0));
	}
	
	@Test
	void PigSatedTest2() {
		Pig pig = new Pig(FoodType.Light, 1000);
		pig.eat(FoodType.Meat, 1000);
		pig.eat(FoodType.Plants, 1000);
		assertTrue(pig.isSated(null, 0));
	}
	
	@Test
	void PigNotSatedTest() {
		Pig pig = new Pig(FoodType.Light, 0);
		pig.eat(FoodType.Meat, 1000);
		pig.eat(FoodType.Plants, 1000);
		assertFalse(pig.isSated(null, 0));
	}
	
	@Test
	void PigNotSatedTest1() {
		Pig pig = new Pig(FoodType.Light, 2001);
		pig.eat(FoodType.Meat, 1000);
		pig.eat(FoodType.Plants, 999);
		assertFalse(pig.isSated(null, 0));
	}
	
	@Test
	void ChimpSatedTest() {
		Chimp chimp = new Chimp(FoodType.Meat, 200);
		chimp.eat(FoodType.Plants, 400);
		chimp.eat(FoodType.Light, 400);
		assertTrue(chimp.isSated(null, 0));
	}
	
	@Test
	void PandaSatedTest() {
		Panda panda = new Panda(FoodType.Plants, 6000);
		assertTrue(panda.isSated(null, 0));
	}
	
	@Test
	void PandaNotSated() {
		Panda panda = new Panda(FoodType.Meat, 6000);
		panda.eat(FoodType.Plants, 5999);
		assertTrue(panda.isSated(null, 0));
	}
	
	@Test
	void WolfSatedTest() {
		Wolf wolf = new Wolf(FoodType.Meat, 100);
		wolf.eat(FoodType.Meat, 100);
		wolf.eat(FoodType.Meat, 200);
		wolf.eat(FoodType.Meat, 200);
		wolf.eat(FoodType.Meat, 200);
		assertTrue(wolf.isSated(null, 0));
	}
	
	@Test
	void WolfNotSatedTest() {
		Wolf wolf = new Wolf(FoodType.Meat, 100);
		wolf.eat(FoodType.Meat, 100);
		wolf.eat(FoodType.Meat, 200);
		wolf.eat(FoodType.Meat, 2000);
		assertFalse(wolf.isSated(null, 0));
	}

}
