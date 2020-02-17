package dongboluong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {
	static int coutTime =0;
	Button() {
		JFrame f = new JFrame();

		JButton b = new JButton(new ImageIcon("b.jpg"));
		b.setBounds(130, 100, 100, 40);

		f.add(b);

		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener() {
			int clicked = 0;

			public void actionPerformed(ActionEvent e) {
				clicked++;
				String x = Integer.toString(clicked);
				System.out.println(x);
				for(int i=0;i<10;i++)
				{
					
					try {
						Thread.sleep(1000);
						coutTime ++;
						System.out.println(coutTime);
						System.out.println();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					
				
			}
		});

	}

	public static void main(String[] args) {
		new Button();
		/*
		 * Timer timer = new Timer(); timer.schedule(new TimerTask() {
		 * 
		 * @Override public void run() { coutTime ++; System.out.println(coutTime);
		 * if(coutTime>10) { ; }
		 * 
		 * 
		 * 
		 * 
		 * } }, 0, 1000);
		 */
	    }

	    public void doStuff(){
	        //do stuff here
	    }
	
}