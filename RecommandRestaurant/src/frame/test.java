package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import restaurant.RestaurantDto;
import restaurant.data;
import restaurant.getRandom;

public class test extends JPanel{
	//데이터 생성자
	data data=new data();
			
	ImageIcon choice_restaurant = new ImageIcon("맛집이표지.png");
	JLabel lblmain_r = new JLabel(choice_restaurant);
	
	// 버튼 관련 변수
	JButton btnBack = new JButton("<< 뒤로가기");
	JButton btnHomeScreen = new JButton("처음으로");
	JButton btnReRecommand = new JButton("다시 추천받기");
	JButton btnReservation = new JButton("예약하기");
	
	TextArea story = new TextArea();
	public test(RestaurantDto r) {	
		// 기본 UI 디자인
		this.init();
		
		// 정보 관련 UI
		this.eventHandler();
		
		//맛집 정보 출력
		this.story = this.mTest(r);
		
	}
	
	private void init()
	{
		// 배경화면 설정
		setBackground(new Color(255,241,202));
		setLayout(null);
		setSize(375, 667);
		
		//상단의 뒤로가기 버튼
		this.btnBack.setBackground(new Color(255,241,202));
		btnBack.setSize(100, 25);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));
		btnBack.setForeground(Color.blue);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		add(btnBack);
		
		// 버튼 디자인
		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(375/3, 100);
		btnHomeScreen.setLocation(0, 525);
		
		btnHomeScreen.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnReRecommand.setSize(375/3, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		
		btnReRecommand.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnReservation.setSize(375/3, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + (375/3), 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("굴림", Font.BOLD, 15));
		
		add(btnHomeScreen);
		add(btnReRecommand);
		add(btnReservation);	
	}
	
	private void eventHandler() {
		// Back버튼 이벤트 핸들러
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameRestaurantCategory_random());
			}
		});
		
		// Home버튼 이벤트 핸들러
		btnHomeScreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameMovieSelect 클래스는 아직 없으므로 오류가 난다.
				FrameBase.getInstance(new FrameBegin());
			}
		});	
		
		// ReRecommand버튼 이벤트 핸들러
		btnReRecommand.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeAll();
				init();
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(data, FrameRestaurantCategory_random.menu);
				story = mTest(category1_choice);
				story.setSize(370, 150);
				story.setLocation(0, 375);
				story.setBackground(new Color(255,241,202));
				story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
				add(story);
				repaint();
			}		
		});	
	}
	
	private TextArea mTest(RestaurantDto r) {
		return new TextArea("1. 가게명: "+r.getPlaceName()+'\n'+"2. 추천메뉴: "+r.getPlaceBest()+'\n'+
				"3. 카테고리명: "+r.getCategoryName()+'\n'+"4. 세부카테고리: "+r.getCategoryDetail()+'\n'+"5. 주소: "+r.getRoadAddressName()
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	}
	
	private void imageChange(ImageIcon i) {
		choice_restaurant = i;
	}
}
