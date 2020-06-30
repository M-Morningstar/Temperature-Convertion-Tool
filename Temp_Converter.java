import java.awt.event.*;

import javax.swing.*;
public class Temp_Converter {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JLabel l = new JLabel();
		l.setBounds(50,50, 300,20);
		JTextField jt = new JTextField("Input number space unit. Example: 25 C.");
		jt.setBounds(75, 125, 250, 20);
		JButton b = new JButton("Convert");
		b.setBounds(150, 175, 100, 20);
		
		jf.add(jt);
		jf.add(b);
		jf.add(l);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String temp = jt.getText();
				String[] parts = temp.split(" ");
				double num = Double.parseDouble(parts[0]);
				if(parts[1].equals("C") || parts[1].equals("c") || parts[1].equals("°C")) {
					double f = (num*9/5) + 32;
					double k = num + 273.15;
					l.setText("      " + num + " °C is equal to " + f + " °F and " + k + " K degrees.");
				}
				else if(parts[1].equals("K") || parts[1].equals("k")) {
					double c = num - 273.15;
					double f = c * 9/5 + 32;
					l.setText("      " + num + " K is equal to " + f + " °F and " + c + " °C degrees.");
				}
				else if(parts[1].equals("f") || parts[1].equals("F") || parts[1].equals("°F")) {
					double c = (num - 32) * 5/9;
					double k = c + 273.15;
					l.setText("      " + num + " °F is equal to " + k + " K and " + c + " °C degrees.");
				}
				
			}
		});
		
	}

}
