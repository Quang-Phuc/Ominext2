package dongboluong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Customer {
	
	private int countTime = 0;
	private int countEventButton = 0;

	public Customer() {
		System.out.println("Event button now" + countEventButton);
	}

	private synchronized void clickMouse() {
		countEventButton++;
		System.out.println("Event Button  " + countEventButton);
		notify();
	}

	private synchronized void eventButton() {

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				countTime++;
				eventButton2();

			}
		}, 1000,1000);
	}

	public void eventButton2() {
		countEventButton++;
		System.out.println("eventButton2 " + countEventButton);
		
		
	}

	

	public static void main(String[] args) {

		final Customer customer = new Customer();
		JFrame f = new JFrame();
		JButton b = new JButton(new ImageIcon("b.jpg"));
		b.setBounds(130, 100, 100, 40);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*------------------------------------------*/
		b.addActionListener(new ActionListener() {
			int clicked = 0;

			public void actionPerformed(ActionEvent e) {
				clicked++;
				String x = Integer.toString(clicked);
				System.out.println(x);
				Thread t1 = new Thread() ;
			
			}
		});

		Thread t1 = new Thread() {

			public void run() {
				customer.clickMouse();
			}

		};

		t1.start();

		Thread t2 = new Thread() {

			public void run() {
				customer.eventButton();
			}
		};

		t2.start();

	}
}
