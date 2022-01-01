package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBegin extends JPanel {
	
	JLabel foodImageLable;
	
	public FrameBegin() {

		Toolkit tk = Toolkit.getDefaultToolkit();//�ػ�
		//JPanel ����
		setBackground(new Color(255,255,255));
		setLayout(null);
//		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
//				((int) tk.getScreenSize().getHeight()) / 2 - 400,
//				375, 667);
		setSize(375, 667);

		//������ �̹���
		ImageIcon main_restaurant = new ImageIcon("������ǥ������.png");
		JLabel lblmain_r = new JLabel(main_restaurant);
		lblmain_r.setSize(375, 300);
		lblmain_r.setLocation(-5, 0);
		add(lblmain_r);

		
		
		//���� ���� �̹��� ���
		ImageIcon label_restaurant = new ImageIcon("�����̱���1.jpg");
		foodImageLable = new JLabel(label_restaurant);
		foodImageLable.setSize(375, (142+75));
		foodImageLable.setLocation(0, 300);
		add(foodImageLable);
		
		//thread�� ���� �̹��� ���
		(new homeImageThread()).start();
		
		
		//�ϴ��� ��ư ����
		ImageIcon lookingfor = new ImageIcon("�����ѷ�����.png");
		ImageIcon recommand = new ImageIcon("��õ����.png");
		ImageIcon newrest = new ImageIcon("�ֱٿ��������.png");
		JButton btnLookingfor = new JButton(lookingfor);
		JButton btnRecommand = new JButton(recommand);
		JButton btnNewRestaurant = new JButton(newrest);

		btnLookingfor.setBackground(new Color(255,192,203)); 
		btnRecommand.setBackground(new Color(255,192,203));
		btnNewRestaurant.setBackground(new Color(255,192,203));

		btnLookingfor.setSize(100, 100);
		btnLookingfor.setLocation(10, 517);
		
		btnLookingfor.setFont(new Font("����", Font.BOLD, 15));
		
		btnRecommand.setSize(100, 100);
		btnRecommand.setLocation(
				(int) btnLookingfor.getLocation().getX() + 110, 
				(int) btnLookingfor.getLocation().getY());
		
		btnRecommand.setFont(new Font("����", Font.BOLD, 15));
		
		btnNewRestaurant.setSize(120, 100);
		btnNewRestaurant.setLocation(
				(int) btnRecommand.getLocation().getX() + 110, 
				(int) btnRecommand.getLocation().getY());
		
		btnNewRestaurant.setFont(new Font("����", Font.BOLD, 15));
		
		btnLookingfor.setBorderPainted(false);
		btnLookingfor.setFocusPainted(false);
		btnRecommand.setBorderPainted(false);
		btnRecommand.setFocusPainted(false);
		btnNewRestaurant.setBorderPainted(false);
		btnNewRestaurant.setFocusPainted(false);
		
		add(btnLookingfor);
		add(btnRecommand);
		add(btnNewRestaurant);
		
		//��ư �̺�Ʈ(�ѷ����� / ��õ�ޱ�)
			btnLookingfor.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//FrameMovieSelect Ŭ������ ���� �����Ƿ� ������ ����.
						FrameBase.getInstance(new FrameRestauntLookaraound());
					}
				});	
			
			btnRecommand.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameRecommandAlgorithm());
						
					}
				});	

		
	}//������
	
	 class homeImageThread extends Thread {
	        public void run() {
	            String[] imgs = {"�����̱���1.jpg","�����̱���2.jpg","�����̱���3.jpg","�����̱���4.jpg","�����̱���5.jpg","�����̱���6.jpg"};
	            while (true) {
	                for (int i = 0; i < imgs.length; i++) {
	                    try {
	                        Thread.sleep(1000);
	                        ImageIcon icon = new ImageIcon(imgs[i]);
//	                        foodImageLable = new JLabel(icon);
//	                        foodImageLable.setSize(375, 142);
//	                		foodImageLable.setLocation(0, 375);
//	                        //add(foodImageLable);
	                		foodImageLable.setIcon(icon);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	
	
}