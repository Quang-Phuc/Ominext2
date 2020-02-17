package restaurant.model;

import java.util.List;

public class DinnerTable {
private String id;
private String customerName;
private int personNumber;
private List<Dish> dishList ;
private String sdt;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getPersonNumber() {
	return personNumber;
}
public void setPersonNumber(int personNumber) {
	this.personNumber = personNumber;
}
public List<Dish> getDishList() {
	return dishList;
}
public void setDishList(List<Dish> dishList) {
	this.dishList = dishList;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
public DinnerTable() {
	super();
}
public DinnerTable(String id, String customerName, int personNumber, List<Dish> dishList, String sdt) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.personNumber = personNumber;
	this.dishList = dishList;
	this.sdt = sdt;
}

}
