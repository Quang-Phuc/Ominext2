package multiLanguage.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class tesst {
	public static void main(String[] args) {
		Locale localeEn = new Locale("en");
		ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
		System.out.println(" anh: "+labels.getString("hello"));
		System.out.println("Trang :"+ labels.getString("menu"));

		
		Locale localeVi = new Locale("vi");
		labels = ResourceBundle.getBundle("messages", localeVi);
		System.out.println("viet: "+labels.getString("hello"));
		System.out.println("Trang :"+ labels.getString("menu"));
	}
}

