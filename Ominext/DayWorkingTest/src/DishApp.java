import java.util.List;
import java.util.TimerTask;

public class DishApp extends TimerTask{
	

	public void tinh() {
		System.out.println("a");
	}

	@Override
	public void run() {
		Dish dish = new Dish();
		double money = 0;
		List<Dish> dishs = dish.insert();
		for (Dish dish2 : dishs) {
			if(dish2.getType()=="a")
			{
				money = money + (dish2.getSl()*dish2.getGia()- (dish2.getSl()*dish2.getGia()* 0.03) );
			}
			if(dish2.getType()=="b")
			{
				money = money + (dish2.getSl()*dish2.getGia()- (dish2.getSl()*dish2.getGia()* 0.05) );
			}
			
		}
		money= money + (money*0.1);
		System.out.println(money);
		
	}
}
