package gui;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import api_calls.Data;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	private ImageIcon img ;
	
	public Home() {
		setBackground(Color.BLACK);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 295, 40, 0};
		gridBagLayout.rowHeights = new int[]{91, 73, 368, 77, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel locationLabel = new JLabel(Data.getLocation());
		locationLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		locationLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_locationLabel = new GridBagConstraints();
		gbc_locationLabel.fill = GridBagConstraints.VERTICAL;
		gbc_locationLabel.insets = new Insets(0, 0, 5, 5);
		gbc_locationLabel.gridx = 1;
		gbc_locationLabel.gridy = 1;
		add(locationLabel, gbc_locationLabel);
		
		JLabel tempLabel = new JLabel(Data.getTemp() + "°F");
		tempLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		tempLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_tempLabel = new GridBagConstraints();
		gbc_tempLabel.insets = new Insets(0, 0, 0, 5);
		gbc_tempLabel.anchor = GridBagConstraints.WEST;
		gbc_tempLabel.fill = GridBagConstraints.VERTICAL;
		gbc_tempLabel.gridx = 1;
		gbc_tempLabel.gridy = 3;
		add(tempLabel, gbc_tempLabel);
		System.out.println(getSize());
		if(Data.getHour() >= 19 || Data.getHour() < 7) {
			
			setNight();
		}
		else if(Data.getHour() >= 7) {
			System.out.println(Data.getHour());

			setAfterNoon();
		}
	}
	
	public void setNight() {
		img = new ImageIcon(this.getClass().getResource("Night.png"));
	}
	
	public void setAfterNoon() {
		img = new ImageIcon(this.getClass().getResource("day.png"));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
	
	
}
