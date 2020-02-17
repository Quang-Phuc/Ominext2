import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {
	public static void main(String[] args) {
		Locale localeEn = new Locale("en");
		ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
		System.out.println(" anh: "+labels.getString("hello"));

		
		Locale localeVi = new Locale("vi");
		labels = ResourceBundle.getBundle("messages", localeVi);
		System.out.println("viet: "+labels.getString("hello"));
	}
}
