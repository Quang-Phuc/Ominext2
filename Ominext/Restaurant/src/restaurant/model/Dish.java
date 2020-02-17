package restaurant.model;

public class Dish {
	private String id;
	private String nameDish;
	private int price;
	private String type;
	private int numberDish;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameDish() {
		return nameDish;
	}
	public void setNameDish(String nameDish) {
		this.nameDish = nameDish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getNumberDish() {
		return numberDish;
	}
	public void setNumberDish(int numberDish) {
		this.numberDish = numberDish;
	}
	public Dish() {
		super();
	}
	public Dish(String id, String nameDish, int price, String type) {
		super();
		this.id = id;
		this.nameDish = nameDish;
		this.price = price;
		this.type = type;
	}
	

}
