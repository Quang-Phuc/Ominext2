package restaurant.serviceImpl;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import restaurant.model.DinnerTable;
import restaurant.model.Dish;
import restaurant.service.DinnerTableService;

public class DinnerTableServiceImpl implements DinnerTableService {
	Scanner sc = new Scanner(System.in);

	@Override
	public DinnerTable insertDinnerTable() {
		DinnerTable dinnerTable = new DinnerTable();
		DishServiceImpl dishServiceImpl = new DishServiceImpl();
		System.out.println("Input Id");
		dinnerTable.setId(sc.nextLine());
		System.out.println("Input Customer Name");
		dinnerTable.setCustomerName(sc.nextLine());
		System.out.println("Input person Number");
		dinnerTable.setPersonNumber(sc.nextInt());
		System.out.println("Input List Dish");
		System.out.println("Input number Dish");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			dishServiceImpl.insertDish();
		}

		sc.nextLine();
		System.out.println("Input Phone Number");
		dinnerTable.setSdt(sc.nextLine());

		return dinnerTable;
	}

	@Override
	public int PayofTable(List<DinnerTable> dinnerTables, Boolean birthday) {
		System.out.println("Input Dinner Table can Pay");
		String IdDinner = sc.nextLine();
		DinnerTable dinnerTable = (DinnerTable) dinnerTables.stream().filter(o -> o.getId().equals(IdDinner))
				.collect(Collectors.toList());
		List<Dish> dishs = dinnerTable.getDishList();
		int payofTable = 0;

		for (Dish dish : dishs) {
			if (birthday) {
				if (dish.getType() == "thit") {
					payofTable = dish.getNumberDish() * dish.getPrice();
					payofTable = payofTable - ((payofTable * 5) / 100);
				}
				if (dish.getType() == "rau") {
					payofTable = dish.getNumberDish() * dish.getPrice();
					payofTable = payofTable - ((payofTable * 3) / 100);
				}
				
			}

			
		}
		return payofTable * (payofTable * 10 / 100);
	}
}
