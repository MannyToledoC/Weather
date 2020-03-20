package gui;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import api_calls.Data;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		JLabel locationLabel = new JLabel(Data.getLocation());
		locationLabel.setForeground(Color.WHITE);
		locationLabel.setBounds(157, 11, 135, 39);
		add(locationLabel);
		
		JLabel tempLabel = new JLabel(Data.getTemp() + " F");
		tempLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tempLabel.setForeground(Color.WHITE);
		tempLabel.setBounds(46, 534, 146, 44);
		add(tempLabel);
		System.out.println(getSize());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		ImageIcon img = new ImageIcon(this.getClass().getResource("After-Noon.png"));
		g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
	
}
