package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import restaurant.Movie;
import restaurant.RestaurantDto;
import restaurant.RestaurantDB;
import restaurant.getRandom;

import frame.test;

//추천_카테고리 선택 화면
public class FrameRestaurantCategory_random extends JPanel {
	//생성자에 내용 추가
	
	static String menu;
	
	public FrameRestaurantCategory_random() {
		RestaurantDB RestaurantDB=new RestaurantDB();
		
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
				FrameBase.getInstance(new FrameRecommandAlgorithm());
			}
		});
		
		
		JLabel subtitle=new JLabel("추천받고 싶은 카테고리를 선택하세요.");
		subtitle.setBounds((75/2)+50, 67/2, 250, 50);
		add(subtitle);
		
		
		
		//카테고리1(한식)의 정보
		ImageIcon cate1 = new ImageIcon("001.png");
		JButton btnCategory1 = new JButton(cate1);
		btnCategory1.setName("한식");
		btnCategory1.setBackground(new Color(255,192,203)); 
		btnCategory1.setSize(100,100);
		btnCategory1.setLocation((75/2)+25,(50+(67/2)));
		btnCategory1.setBorderPainted(false);
		btnCategory1.setFocusPainted(false);
		add(btnCategory1);
		
		
		btnCategory1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "한식");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
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
		
		btnCategory2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "양식");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
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
		
		btnCategory3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "중식");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
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
		
		btnCategory4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "일식");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="일식";
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
		
		btnCategory5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "패스트푸드");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
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
		
		btnCategory6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "샐러드");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="샐러드";
			}
		});
		
		
		//카테고리7(전체보기)의 정보
		ImageIcon mdPick = new ImageIcon("md pick.png");
		JButton btnCategory7 = new JButton(mdPick);
		btnCategory7.setName("전체랜덤");
		btnCategory7.setBackground(new Color(255,241,202)); 
		btnCategory7.setSize(250,50);
		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
		btnCategory7.setBorderPainted(false);
		btnCategory7.setFocusPainted(false);
		add(btnCategory7);
		
		btnCategory7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu=null;
			}
		});
		
		
/*
		btnMovie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie1 = new RestaurantDto().searchMovie("라라랜드");
				FrameBase.getInstance(new FrameMovieInfo(movie1));
			}
		});
		
		
		//영화2의 정보
		ImageIcon movie2 = new ImageIcon("말할수없는비밀.jpg");
		JButton btnMovie2 = new JButton(movie2);
		btnMovie2.setName("말할수없는비밀");

		btnMovie2.setSize(185,250);
		btnMovie2.setLocation(320,30);
		add(btnMovie2);

		btnMovie2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie2 = new RestaurantDto().searchMovie("말할수없는비밀");
				FrameBase.getInstance(new FrameMovieInfo(movie2));
			}
		});

		//영화3의 정보
		ImageIcon movie3 = new ImageIcon("인사이드아웃.png");
		JButton btnMovie3 = new JButton(movie3);
		btnMovie3.setName("인사이드아웃");

		btnMovie3.setSize(185,250);
		btnMovie3.setLocation(72,340);
		add(btnMovie3);

		btnMovie3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie3 = new RestaurantDto().searchMovie("인사이드아웃");
				FrameBase.getInstance(new FrameMovieInfo(movie3));
			}
		});

		//영화4의 정보
		ImageIcon movie4 = new ImageIcon("겨울왕국.png");
		JButton btnMovie4 = new JButton(movie4);
		btnMovie4.setName("겨울왕국");

		btnMovie4.setSize(185,250);
		btnMovie4.setLocation(320,340);
		add(btnMovie4);

		btnMovie4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie4 = new RestaurantDto().searchMovie("겨울왕국");
				FrameBase.getInstance(new FrameMovieInfo(movie4));
			}
		});

		//하단의 버튼
		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setLayout(null);
		bottomSet.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("뒤로가기");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		JButton btnNext = new JButton("다음 페이지");

		btnNext.setBackground(new Color(0xA6A6A6));
		btnNext.setSize(183, 87);
		btnNext.setLocation(391, 0);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnNext);

		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//다음페이지로 넘어가기 기능 만들어줘야 한다.
				//FrameMovieSelect2 클래스를 만들어서 1번과 동일하게 내용 처리
				FrameBase.getInstance( new FrameMovieSelect2() );
			}
		});

		add(bottomSet, BorderLayout.SOUTH);
*/
	}//생성자
}
