package frame;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//import restaurant.Movie;
import restaurant.RestaurantDto;
import restaurant.RestaurantDB;
import restaurant.getRandom;
import frame.FrameViewCategory;

//둘러보기 화면, 카테고리에서 하나 선택시 
public class FrameRecommandAlgorithm extends JPanel {
	
	//생성자에 내용 추가
	public FrameRecommandAlgorithm() {
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
		
		
		//타이틀 라벨
		JLabel q1=new JLabel("<HTML><body style='text-align:center;'>당신을 위한 최고의 식당을 찾기위해<br>아래 질문에 답해주세요!</body></HTML>"); //안내문구처럼 붙여놓을때
		q1.setBounds(50,30, 300, 50);
		q1.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		add(q1);
		
		
		
		//식사하는 사람이 있는지 여부 확인
		JLabel q2=new JLabel("<HTML><body style='text-align:center;'>함께 식사하는 사람이 있나요?</body></HTML>");
		q2.setBounds(75, 100, 250, 50);
		q2.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		
		JPanel s2=new JPanel();
		s2.setBounds(5, 150, 327, 60);
		//체크박스 만들기
		JRadioButton chk1 = new JRadioButton("친구");
        JRadioButton chk2 = new JRadioButton("커플");
        JRadioButton chk3 = new JRadioButton("동료");
        JRadioButton chk4 = new JRadioButton("가족");
        JRadioButton chk5 = new JRadioButton("혼밥");
        JRadioButton chk6 = new JRadioButton("고려하지 않음");
        ButtonGroup rg = new ButtonGroup();
        rg.add(chk1);
        rg.add(chk2);
        rg.add(chk3);    
        rg.add(chk4);    
        rg.add(chk5);    
        rg.add(chk6);   
        s2.add(chk1);
        s2.add(chk2);
        s2.add(chk3);    
        s2.add(chk4);    
        s2.add(chk5);    
        s2.add(chk6); 
        
		add(q2);
		add(s2);
		
		
		
		
		//선호하는 분위기 확인
		JLabel q3=new JLabel("<HTML><body style='text-align:center;'>선호하는 분위기가 있나요?</body></HTML>");
		q3.setBounds(75, 250, 250, 50);
		q3.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		
		JPanel s3=new JPanel();
		s3.setBounds(5, 290, 327, 90);
		//체크박스 만들기
		JCheckBox bt1 = new JCheckBox("감탄하는");
		JCheckBox bt2 = new JCheckBox("조화로운");
		JCheckBox bt3 = new JCheckBox("감동적인");
		JCheckBox bt4 = new JCheckBox("정갈한");
		JCheckBox bt5 = new JCheckBox("재즈느낌의");
		JCheckBox bt6 = new JCheckBox("깔끔한");
		JCheckBox bt7 = new JCheckBox("편안한");
		JCheckBox bt8 = new JCheckBox("차분한");
		JCheckBox bt9 = new JCheckBox("상관하지 않음");
          
        s3.add(bt1);
        s3.add(bt2);
        s3.add(bt3);    
        s3.add(bt4);    
        s3.add(bt5);    
        s3.add(bt6); 
        s3.add(bt7); 
        s3.add(bt8); 
        s3.add(bt9); 
        
		add(q3);
		add(s3);
		
		Choice md = new Choice();
	      
	      md.add("선호하는 취향 선택");
	      //md.add(" ");
	      md.add("조용한");
	      md.add("깔끔한");
	      md.add("가성비좋은");
	      md.add("선택안함");
	      

	      
	      md.setSize(300,0);
	      md.setLocation(5,450);
	      md.setBackground(Color.pink);
	      md.setFont(new Font("여기어때 잘난체", Font.BOLD, 13));

	      
	      add(md);
		
		
		//희망 가격대 여부 확인
		JLabel q4=new JLabel("<HTML><body style='text-align:center;'>희망하는 가격대가 있나요?</body></HTML>");
		q4.setBounds(75, 400, 250, 50);
		q4.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		
		JPanel s4=new JPanel();
		s4.setBounds(5, 450, 327, 60);
		//체크박스 만들기
		JRadioButton rad1 = new JRadioButton("1만원 이내");
        JRadioButton rad2 = new JRadioButton("2만원 이내");
        JRadioButton rad3 = new JRadioButton("3만원 이내");
        JRadioButton rad4 = new JRadioButton("4만원 이내");
        JRadioButton rad5 = new JRadioButton("5만원 이내");
        JRadioButton rad6 = new JRadioButton("그 이상");
        ButtonGroup rg2 = new ButtonGroup();
        rg2.add(chk1);
        rg2.add(chk2);
        rg2.add(chk3);    
        rg2.add(chk4);    
        rg2.add(chk5);    
        rg2.add(chk6);   
        s4.add(rad1);
        s4.add(rad2);
        s4.add(rad3);    
        s4.add(rad4);    
        s4.add(rad5);    
        s4.add(rad6); 
        
		add(q4);
		add(s4);
		
		
		
		//다음으로 버튼
		ImageIcon viewNext = new ImageIcon("다음으로.png");
		JButton btnCategory7 = new JButton(viewNext);
		btnCategory7.setName("다음으로");
		btnCategory7.setSize(250,50);
		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
		btnCategory7.setBorderPainted(false);
		btnCategory7.setFocusPainted(false);
		add(btnCategory7);
		
		//->전체보기 버튼액선
		btnCategory7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameRestaurantCategory_random());
			
			}
		});
		
		
		//========================
		
//		JLabel subtitle=new JLabel("희망하는 카테고리를 선택하세요");
//		subtitle.setBounds((75/2)+65, 67/2, 250, 50);
//		add(subtitle);
//		
//		//카테고리1(한식)의 정보
//		ImageIcon cate1 = new ImageIcon("001.png");
//		JButton btnCategory1 = new JButton(cate1);
//		btnCategory1.setName("한식");
//		btnCategory1.setBackground(new Color(255,192,203)); 
//		btnCategory1.setSize(100,100);
//		btnCategory1.setLocation((75/2)+25,(50+(67/2)));
//		btnCategory1.setBorderPainted(false);
//		
//		add(btnCategory1);
//		
//		//->한식 버튼액션
//		btnCategory1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "한식");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="한식";
//			}
//		});
//		
//		//카테고리2(양식)의 정보
//		ImageIcon cate2 = new ImageIcon("002.png");
//		JButton btnCategory2 = new JButton(cate2);
//		btnCategory2.setName("양식");
//		btnCategory2.setBackground(new Color(255,192,203)); 
//		btnCategory2.setSize(100,100);
//		btnCategory2.setLocation((75/2)+175,(50+(67/2)));
//		btnCategory2.setBorderPainted(false);
//		btnCategory2.setFocusPainted(false);
//		add(btnCategory2);
//		
//		//->양식 버튼액선
//		btnCategory2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "양식");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="양식";
//			}
//		});
//		
//		
//		
//		//카테고리3(중식)의 정보
//		ImageIcon cate3 = new ImageIcon("003.png");
//		JButton btnCategory3 = new JButton(cate3);
//		btnCategory3.setName("중식");
//		btnCategory3.setBackground(new Color(255,192,203)); 
//		btnCategory3.setSize(100,100);
//		btnCategory3.setLocation((75/2)+25,(50+(67/2))+150);
//		btnCategory3.setBorderPainted(false);
//		btnCategory3.setFocusPainted(false);
//		add(btnCategory3);
//		
//		//->중식 버튼액선
//		btnCategory3.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "중식");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="중식";
//			}
//		});
//		
//		
//		//카테고리4(일식)의 정보
//		ImageIcon cate4 = new ImageIcon("004.png");
//		JButton btnCategory4 = new JButton(cate4);
//		btnCategory4.setName("일식");
//		btnCategory4.setBackground(new Color(255,192,203)); 
//		btnCategory4.setSize(100,100);
//		btnCategory4.setLocation((75/2)+175,(50+(67/2))+150);
//		btnCategory4.setBorderPainted(false);
//		btnCategory4.setFocusPainted(false);
//		add(btnCategory4);
//		
//		//->일식 버튼액선
//		btnCategory4.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "중식");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="중식";
//			}
//		});
//		
//		
//		
//		//카테고리5(패스트부드)의 정보
//		ImageIcon cate5 = new ImageIcon("005.png");
//		JButton btnCategory5 = new JButton(cate5);
//		btnCategory5.setName("패스트푸드");
//		btnCategory5.setBackground(new Color(255,192,203)); 
//		btnCategory5.setSize(100,100);
//		btnCategory5.setLocation((75/2)+25,(50+(67/2))+150+150);
//		btnCategory5.setBorderPainted(false);
//		btnCategory5.setFocusPainted(false);
//		add(btnCategory5);
//		
//		//->패스트푸드 버튼액선
//		btnCategory5.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "패스트푸드");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="패스트푸드";
//			}
//		});
//		
//		
//		//카테고리6(샐러드)의 정보
//		ImageIcon cate6 = new ImageIcon("006.png");
//		JButton btnCategory6 = new JButton(cate6);
//		btnCategory6.setName("샐러드");
//		btnCategory6.setBackground(new Color(255,192,203)); 
//		btnCategory6.setSize(100,100);
//		btnCategory6.setLocation((75/2)+175,(50+(67/2))+150+150);
//		btnCategory6.setBorderPainted(false);
//		btnCategory6.setFocusPainted(false);
//		add(btnCategory6);
//		
//		//->샐러드 버튼액선
//		btnCategory6.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "샐러드");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="샐러드";
//			}
//		});
//		
//		
//		//카테고리7(전체보기)의 정보
//		ImageIcon viewAll = new ImageIcon("전체보기.png");
//		JButton btnCategory7 = new JButton(viewAll);
//		btnCategory7.setName("전체보기");
//		btnCategory7.setBackground(new Color(255,255,255)); //우리노랑
//		btnCategory7.setSize(250,50);
//		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
//		btnCategory7.setBorderPainted(false);
//		btnCategory7.setFocusPainted(false);
//		add(btnCategory7);
//		
//		//->전체보기 버튼액선
//		btnCategory7.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = (ArrayList<RestaurantDto>) RestaurantDB.makeList();
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu=null;
//			}
//		});
		
	}//생성자

}

