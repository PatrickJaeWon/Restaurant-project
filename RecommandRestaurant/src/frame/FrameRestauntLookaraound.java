package frame;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import restaurant.Movie;
import restaurant.RestaurantDto;
import restaurant.RestaurantDB;
import restaurant.getRandom;
import frame.FrameViewCategory;

//둘러보기 화면, 카테고리에서 하나 선택시 
public class FrameRestauntLookaraound extends JPanel {

	static String menu;
	
	//생성자에 내용 추가
	public FrameRestauntLookaraound() {
		RestaurantDB RestaurantDB=new RestaurantDB();
//		this.eventHandler();
		
		//JPanel 구조
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);

		//상단의 뒤로가기 버튼
		JButton btnBack = new JButton("<<");
		btnBack.setBackground(new Color(255,255,255)); //우리노랑
		btnBack.setSize(80, 25);
		btnBack.setLocation(5, 5);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		btnBack.setForeground(Color.black);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});
		
		
//		//=====================================================
		
		JLabel subtitle=new JLabel("희망하는 카테고리를 선택하세요");
		subtitle.setBounds((75/2)+65, 67/2, 250, 50);
		add(subtitle);
		
		//카테고리1(한식)의 정보
		ImageIcon cate1 = new ImageIcon("001.png");
		JButton btnCategory1 = new JButton(cate1);
		btnCategory1.setName("한식");
		btnCategory1.setBackground(new Color(255,192,203)); 
		btnCategory1.setSize(100,100);
		btnCategory1.setLocation((75/2)+25,(50+(67/2)));
		btnCategory1.setBorderPainted(false);
		
		add(btnCategory1);
		
		//->한식 버튼액션
		btnCategory1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "한식");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="한식";
			}
		});
		
		//카테고리2(양식)의 정보
		ImageIcon cate2 = new ImageIcon("002.png");
		JButton btnCategory2 = new JButton(cate2);
		btnCategory2.setName("양식");
		btnCategory2.setBackground(new Color(255,192,203)); 
		btnCategory2.setSize(100,100);
		btnCategory2.setLocation((75/2)+175,(50+(67/2)));
		btnCategory2.setBorderPainted(false);
		btnCategory2.setFocusPainted(false);
		add(btnCategory2);
		
		//->양식 버튼액선
		btnCategory2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "양식");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="양식";
			}
		});
		
		
		
		//카테고리3(중식)의 정보
		ImageIcon cate3 = new ImageIcon("003.png");
		JButton btnCategory3 = new JButton(cate3);
		btnCategory3.setName("중식");
		btnCategory3.setBackground(new Color(255,192,203)); 
		btnCategory3.setSize(100,100);
		btnCategory3.setLocation((75/2)+25,(50+(67/2))+150);
		btnCategory3.setBorderPainted(false);
		btnCategory3.setFocusPainted(false);
		add(btnCategory3);
		
		//->중식 버튼액선
		btnCategory3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "중식");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="중식";
			}
		});
		
		
		//카테고리4(일식)의 정보
		ImageIcon cate4 = new ImageIcon("004.png");
		JButton btnCategory4 = new JButton(cate4);
		btnCategory4.setName("일식");
		btnCategory4.setBackground(new Color(255,192,203)); 
		btnCategory4.setSize(100,100);
		btnCategory4.setLocation((75/2)+175,(50+(67/2))+150);
		btnCategory4.setBorderPainted(false);
		btnCategory4.setFocusPainted(false);
		add(btnCategory4);
		
		//->일식 버튼액선
		btnCategory4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "중식");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="중식";
			}
		});
		
		
		
		//카테고리5(패스트부드)의 정보
		ImageIcon cate5 = new ImageIcon("005.png");
		JButton btnCategory5 = new JButton(cate5);
		btnCategory5.setName("패스트푸드");
		btnCategory5.setBackground(new Color(255,192,203)); 
		btnCategory5.setSize(100,100);
		btnCategory5.setLocation((75/2)+25,(50+(67/2))+150+150);
		btnCategory5.setBorderPainted(false);
		btnCategory5.setFocusPainted(false);
		add(btnCategory5);
		
		//->패스트푸드 버튼액선
		btnCategory5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "패스트푸드");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="패스트푸드";
			}
		});
		
		
		//카테고리6(샐러드)의 정보
		ImageIcon cate6 = new ImageIcon("006.png");
		JButton btnCategory6 = new JButton(cate6);
		btnCategory6.setName("샐러드");
		btnCategory6.setBackground(new Color(255,192,203)); 
		btnCategory6.setSize(100,100);
		btnCategory6.setLocation((75/2)+175,(50+(67/2))+150+150);
		btnCategory6.setBorderPainted(false);
		btnCategory6.setFocusPainted(false);
		add(btnCategory6);
		
		//->샐러드 버튼액선
		btnCategory6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "샐러드");
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="샐러드";
			}
		});
		
		
		//카테고리7(전체보기)의 정보
		ImageIcon viewAll = new ImageIcon("전체보기.png");
		JButton btnCategory7 = new JButton(viewAll);
		btnCategory7.setName("전체보기");
		btnCategory7.setBackground(new Color(255,255,255)); //우리노랑
		btnCategory7.setSize(250,50);
		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
		btnCategory7.setBorderPainted(false);
		btnCategory7.setFocusPainted(false);
		add(btnCategory7);
		
		//->전체보기 버튼액선
		btnCategory7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<RestaurantDto> category1_choice = (ArrayList<RestaurantDto>) RestaurantDB.makeList();
				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu=null;
			}
		});
		
	}//생성자

}
