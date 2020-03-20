package gui;

import javax.swing.JPanel;

import javax.swing.JLabel;

import api_calls.Data;
import java.awt.Color;
public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		JLabel locationLabel = new JLabel(Data.getLocation());
		locationLabel.setForeground(Color.WHITE);
		locationLabel.setBounds(180, 11, 135, 39);
		add(locationLabel);
		
		JLabel tempLabel = new JLabel(Data.getTemp());
		tempLabel.setForeground(Color.WHITE);
		tempLabel.setBounds(93, 57, 79, 14);
		add(tempLabel);
		
		JLabel minTempLabel = new JLabel(Data.getTempMin());
		minTempLabel.setForeground(Color.WHITE);
		minTempLabel.setBounds(93, 165, 79, 14);
		add(minTempLabel);
		
		JLabel maxTempLabel = new JLabel(Data.getTempMax());
		maxTempLabel.setForeground(Color.WHITE);
		maxTempLabel.setBounds(93, 112, 79, 14);
		add(maxTempLabel);
		
		JLabel tempLabelTag = new JLabel("Temperature");
		tempLabelTag.setForeground(Color.WHITE);
		tempLabelTag.setBounds(10, 57, 79, 14);
		add(tempLabelTag);
		
		JLabel minTempLabelTag = new JLabel("Low");
		minTempLabelTag.setForeground(Color.WHITE);
		minTempLabelTag.setBounds(10, 165, 63, 14);
		add(minTempLabelTag);
		
		JLabel maxTempLabelTag = new JLabel("High");
		maxTempLabelTag.setForeground(Color.WHITE);
		maxTempLabelTag.setBounds(10, 112, 73, 14);
		add(maxTempLabelTag);
		System.out.println(Data.getLocation());
	}
}
