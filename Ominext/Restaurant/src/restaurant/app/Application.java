package restaurant.app;

import restaurant.service.DinnerTableService;
import restaurant.serviceImpl.DinnerTableServiceImpl;

public class Application {
	public static void main(String[] args) {
		DinnerTableService dinnerTableService = new DinnerTableServiceImpl();
		dinnerTableService.insertDinnerTable();
	}
}
