package com.ziyin.jdk8;

import javax.swing.*;

/**
 * @author ziyin
 @create 2019-01-2019/1/19-20:27
 */
public class SwingTest {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("my jframe");
		JButton jButton = new JButton("my jbutton");
		jButton.addActionListener(event -> System.out.println("button pressed!"));
		jFrame.add(jButton);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
