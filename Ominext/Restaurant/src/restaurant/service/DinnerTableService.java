package restaurant.service;

import java.util.List;

import restaurant.model.DinnerTable;

public interface DinnerTableService {

	public DinnerTable insertDinnerTable();
	public int PayofTable(List<DinnerTable> dinnerTables, Boolean birthday);
	
}
