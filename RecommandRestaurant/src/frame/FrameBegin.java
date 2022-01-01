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

		Toolkit tk = Toolkit.getDefaultToolkit();//해상도
		//JPanel 구조
		setBackground(new Color(255,255,255));
		setLayout(null);
//		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
//				((int) tk.getScreenSize().getHeight()) / 2 - 400,
//				375, 667);
		setSize(375, 667);

		//포스터 이미지
		ImageIcon main_restaurant = new ImageIcon("맛집이표지최종.png");
		JLabel lblmain_r = new JLabel(main_restaurant);
		lblmain_r.setSize(375, 300);
		lblmain_r.setLocation(-5, 0);
		add(lblmain_r);

		
		
		//랜덤 광고 이미지 출력
		ImageIcon label_restaurant = new ImageIcon("맛집이광고1.jpg");
		foodImageLable = new JLabel(label_restaurant);
		foodImageLable.setSize(375, (142+75));
		foodImageLable.setLocation(0, 300);
		add(foodImageLable);
		
		//thread로 광고 이미지 출력
		(new homeImageThread()).start();
		
		
		//하단의 버튼 설정
		ImageIcon lookingfor = new ImageIcon("맛집둘러보기.png");
		ImageIcon recommand = new ImageIcon("추천맛집.png");
		ImageIcon newrest = new ImageIcon("최근에생긴맛집.png");
		JButton btnLookingfor = new JButton(lookingfor);
		JButton btnRecommand = new JButton(recommand);
		JButton btnNewRestaurant = new JButton(newrest);

		btnLookingfor.setBackground(new Color(255,192,203)); 
		btnRecommand.setBackground(new Color(255,192,203));
		btnNewRestaurant.setBackground(new Color(255,192,203));

		btnLookingfor.setSize(100, 100);
		btnLookingfor.setLocation(10, 517);
		
		btnLookingfor.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnRecommand.setSize(100, 100);
		btnRecommand.setLocation(
				(int) btnLookingfor.getLocation().getX() + 110, 
				(int) btnLookingfor.getLocation().getY());
		
		btnRecommand.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnNewRestaurant.setSize(120, 100);
		btnNewRestaurant.setLocation(
				(int) btnRecommand.getLocation().getX() + 110, 
				(int) btnRecommand.getLocation().getY());
		
		btnNewRestaurant.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnLookingfor.setBorderPainted(false);
		btnLookingfor.setFocusPainted(false);
		btnRecommand.setBorderPainted(false);
		btnRecommand.setFocusPainted(false);
		btnNewRestaurant.setBorderPainted(false);
		btnNewRestaurant.setFocusPainted(false);
		
		add(btnLookingfor);
		add(btnRecommand);
		add(btnNewRestaurant);
		
		//버튼 이벤트(둘러보기 / 추천받기)
			btnLookingfor.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//FrameMovieSelect 클래스는 아직 없으므로 오류가 난다.
						FrameBase.getInstance(new FrameRestauntLookaraound());
					}
				});	
			
			btnRecommand.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameRecommandAlgorithm());
						
					}
				});	

		
	}//생성자
	
	 class homeImageThread extends Thread {
	        public void run() {
	            String[] imgs = {"맛집이광고1.jpg","맛집이광고2.jpg","맛집이광고3.jpg","맛집이광고4.jpg","맛집이광고5.jpg","맛집이광고6.jpg"};
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