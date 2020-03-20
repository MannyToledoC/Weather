package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.Home;
import java.awt.Color;
import java.awt.CardLayout;

public class Frame extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	private Home home = new Home();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 600, 375, 667);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		renderHome();
	}
	
	public void renderHome() {
		contentPane.setLayout(null);
		home.setBounds(0, 0, 375, 667);
		contentPane.add(home);
	}

}
