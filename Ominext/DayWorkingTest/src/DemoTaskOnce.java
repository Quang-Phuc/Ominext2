import java.util.Timer;

public class DemoTaskOnce {
	public static void main(String[] args) {
		DishApp dishApp = new DishApp();
	    Timer timer = new Timer();
	    timer.schedule(dishApp, 0, 2000);
	    

}
}
