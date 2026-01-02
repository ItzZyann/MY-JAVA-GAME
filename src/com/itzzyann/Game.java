package com.itzzyann;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
	private JLabel mIcon;
	private int mIcon_x = 0;
	private int mIcon_speed = 10;
	
	public Game() {
		this.setTitle("Game");
		this.setSize(600, 480);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image scaledImg = new ImageIcon("resources/image.png").getImage();
		Image newImg = scaledImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon img = new ImageIcon(newImg);
		
		mIcon = new JLabel();
		mIcon.setIcon(img);
		
		this.add(mIcon);
		
		Timer _timer = new Timer(16, e -> {
			update();
			render();
		});
		
		_timer.start();
	}
	
	private void update() { }
	private void render() {
		mIcon_x += mIcon_speed;
		
		// pang debug raning dapita
		// depende nani ninyu ug i uncomment ninyo
		// System.out.println("Icon X: " + mIcon_x);
		
		if(mIcon_x == 570) {
			mIcon_x = 0; // pabalikon natu
		}
		
		mIcon.setLocation(mIcon_x, 100);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Game().setVisible(true);
		});
	}
}
