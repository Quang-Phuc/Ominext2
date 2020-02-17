package restaurant.serviceImpl;

import java.util.Scanner;

import restaurant.model.Dish;
import restaurant.service.DishService;

public class DishServiceImpl implements DishService {
	Scanner sc = new Scanner(System.in);

	@Override
	public Dish insertDish() {
		Dish dish = new Dish();
		System.out.println("Input Id");
		dish.setId(sc.nextLine());
		System.out.println("Input Dish Name");
		dish.setNameDish(sc.nextLine());
		System.out.println("Input Price ");
		dish.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.println("Input Type");
		dish.setType(sc.nextLine());
		System.out.println("Input Dish Number");
		dish.setNumberDish(sc.nextInt());
		sc.nextLine();
		return dish;
	}

}
