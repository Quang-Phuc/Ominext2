import java.util.Arrays;
import java.util.List;

public class Dish {
	private String type;
	private int sl;
	private int gia;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public Dish() {
		super();
	}
	public Dish(String type, int sl, int gia) {
		super();
		this.type = type;
		this.sl = sl;
		this.gia = gia;
	}
	 public List<Dish> insert()
	 {
		 List<Dish> dishs = Arrays.asList(new Dish("a", 2, 3), new Dish("a", 1, 3), new Dish("b", 1, 2),new Dish("c", 10, 12));
		 return dishs;
	 }

}
