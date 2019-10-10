package cube.storage;

import cube.model.food.Food;
import cube.model.food.FoodList;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodStorage implements Serializable {
	private FoodList foodList;

	public FoodStorage() {
		this.foodList = new FoodList();
	}

	public FoodStorage(FoodList foodList) {
		this.foodList = foodList;
	}

	public FoodList loadFood() {
		return foodList;
	}

	public void appendFood(Food food) {
		foodList.add(food);
	}

	public void storeFoodList(FoodList foodlist) {
		this.foodList = foodlist;
	}
}