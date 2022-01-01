package frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class FrameViewCategory extends JFrame {
	JPanel upperPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel lowerPanel = new JPanel();
	JPanel contentPanel = new JPanel(null);
	JScrollPane scroll;
	
	// Button UI
	JButton btnBack = new JButton("<< �ڷΰ���");
	
	public FrameViewCategory() {
		setSize(375, 667);
		
		initUI();
	
		
		setContentPane(contentPanel);
		setVisible(true);
	}
	
	private void initUI() {
		//����� �ڷΰ��� ��ư
		btnBack.setBackground(new Color(255,241,202));
		btnBack.setSize(100, 25);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 10));
		btnBack.setForeground(Color.blue);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		add(btnBack);
		
		// ��ũ�ѹ� UI
		mainPanel = new JPanel();
		scroll = new JScrollPane(mainPanel);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(0, 25, 360, 500);
		contentPanel.add(scroll);
		
		// 
	}
	
	public static void main(String[] args) {
		 FrameViewCategory bar = new  FrameViewCategory();
	}
}

