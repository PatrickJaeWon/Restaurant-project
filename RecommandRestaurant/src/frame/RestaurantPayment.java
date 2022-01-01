package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import restaurant.RestaurantDto;
import restaurant.HtmlUtils;
import restaurant.RestaurantDB;
import restaurant.getRandom;

//선택된 맛집 결제하기 화면
public class RestaurantPayment  extends JPanel{
	
	public RestaurantPayment(RestaurantDto r) {
		
		//데이터 생성자
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);
		
		//상단의 뒤로가기 버튼
		JButton btnBack = new JButton("<<");

		btnBack.setBackground(new Color(255,255,255));
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
				FrameBase.getInstance(new FrameRestaurantCategory_random());
			}
		});
		
		JLabel subtitle=new JLabel("예약하기");
		subtitle.setBounds(150, 1, 250, 50);
		subtitle.setForeground(Color.black);
		subtitle.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		add(subtitle);
		
		
		//맛집 사진 출력
		//ImageIcon choice_restaurant = new ImageIcon(HtmlUtils.imgHtmlParser(r.getImg()));//r.getImg()
		JLabel lblmain_r = new JLabel(HtmlUtils.imgHtmlParser(r.getImg()));
		lblmain_r.setSize(375, 345);
		lblmain_r.setLocation(5, 67/2);
		add(lblmain_r);
		

		
		Choice reserveTime = new Choice();
		long time = System.currentTimeMillis();

		SimpleDateFormat dayTime = 
			new SimpleDateFormat("MM월 dd일(EE)");//(EE:요일)

		String str = dayTime.format( new Date(time) );

		String[] timeSlot = { 
				"예약시간 선택", 
				str + " 10:00",
				str + " 11:00", 
				str + " 12:00", 
				str + " 13:00", 
				str + " 14:00",
				str + " 15:00",
				str + " 17:00", 
				str + " 18:00",
				str + " 19:00",
				str + " 20:00",
				str + " 21:00",
				};

		for (int i = 0; i < timeSlot.length; i++) {
			reserveTime.add(timeSlot[i]);
		}

		reserveTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 13));
		reserveTime.setSize(240, 100);
		reserveTime.setLocation(155, 415);
		
		add(reserveTime);
		
		
		
		
		Choice reserveNumber = new Choice();
		reserveNumber.add("1명");
		reserveNumber.add("2명");
		reserveNumber.add("3명");
		reserveNumber.add("4명");
		reserveNumber.add("5명");
		reserveNumber.add("6명");
		reserveNumber.add("7명");
		reserveNumber.add("8명");
		
		reserveNumber.setFont(new Font("나눔고딕코딩", Font.PLAIN, 13));
		reserveNumber.setSize(150, 100);
		reserveNumber.setLocation(100, 415+20);
		
		add(reserveNumber);
		
		
		
		//맛집 정보 출력
		TextArea story = new TextArea("1. 가게명: "+r.getPlaceName()+'\n'+
				"2. 예약가능여부: "+"가능"+'\n'+
				"3. 희망 예약시간: "+'\n'+
				"4. 인원수: "+'\n'
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(350, 150);
		story.setLocation(0, 375);
		story.setBackground(new Color(255,255,255));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		add(story);
		
		
		//하단의 버튼 설정
		ImageIcon home = new ImageIcon("홈으로.png");
		JButton btnHomeScreen = new JButton(home);
		ImageIcon reRecommand = new ImageIcon("다시추천받기.png");
		JButton btnReRecommand = new JButton(reRecommand);
		ImageIcon reserve = new ImageIcon("예약하기.png");
		JButton btnReservation = new JButton(reserve);

		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(100, 100);
		btnHomeScreen.setLocation(0, 525);
		
		btnHomeScreen.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnReRecommand.setSize(100, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		
		btnReRecommand.setFont(new Font("굴림", Font.BOLD, 15));
		
		btnReservation.setSize(100, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + (375/3), 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("굴림", Font.BOLD, 15));
		
		add(btnHomeScreen);
		add(btnReRecommand);
		add(btnReservation);
		
		//버튼 이벤트(처음으로 돌아가기 / 후기 남기기)
			btnHomeScreen.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameBegin());
					}
				});	
				
			btnReRecommand.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(FrameRestaurantCategory_random.menu!=null) {
							RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, FrameRestaurantCategory_random.menu);
							FrameBase.getInstance(new RestaurantPayment(category1_choice));
							//System.out.println(category1_choice);
						}else {
							RestaurantDto category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
							FrameBase.getInstance(new RestaurantPayment(category1_choice));
						}
					}
					
					
				});	
			
			
			//결제하기 버튼 유효성 체크
			btnReservation.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (reserveTime.getSelectedItem().equals("예약시간 선택")) {
						JOptionPane.showMessageDialog(
								null, "시간을 선택해 주세요");
					} else {
						JOptionPane.showMessageDialog(null,"1. 가게명: "+r.getPlaceName()+'\n'+
							"2. 희망 예약시간: "+reserveTime.getSelectedItem()+'\n'+
							"3. 인원수: "+reserveNumber.getSelectedItem()+'\n'+"으로 예약이 완료되었습니다.");
					}
				}
			});//addActionListener
		
		//음식점별 사진 다운
		//데이터 가공
		//창에서 음식+상세내용 출력
		//돌아가기
		//
		
	}
}
