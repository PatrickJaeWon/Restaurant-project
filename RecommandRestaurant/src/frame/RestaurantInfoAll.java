package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import restaurant.HtmlUtils;
import restaurant.RestaurantDto;
import restaurant.RestaurantDB;
import restaurant.getRandom;

//맛집 둘러보기 하나씩
public class RestaurantInfoAll  extends JPanel{
	
	static int index=0;
	
	public RestaurantInfoAll(ArrayList<RestaurantDto> category1_choice) {
		
		//데이터 생성자
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);
		
		/*
		 * 뒤로가기 버튼
		 */
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
		
		
		/*
		 * 당신을 위한 추천 맛집 라벨
		 */
//		JLabel subtitle=new JLabel("당신을 위한 추천 맛집!");
//		subtitle.setBounds(110, 1, 250, 50);
//		subtitle.setForeground(Color.black);
//		subtitle.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
//		add(subtitle);
		
		
		/*
		 * 맛집 정보 출력_사진
		 */
		//ImageIcon choice_restaurant = new ImageIcon(HtmlUtils.imgHtmlParser(category1_choice.get(index).getImg()));//r.getImg()
		//ImageIcon choice_restaurant = new ImageIcon("<HTML><body><div><img width='300' height='300' src=https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"
		//        + "></div></body></HTML>");//r.getImg()
		
		JLabel lblmain_r = new JLabel(HtmlUtils.imgHtmlParser(category1_choice.get(index).getImg()));
		//lblmain_r.setSize(375, 345);
		lblmain_r.setSize(375, 345);
		lblmain_r.setLocation(5, 67/2);
		add(lblmain_r);
		
		
		
		/*
		 * 맛집 정보 출력_텍스트
		 */
		TextArea story = new TextArea("1. 가게명: "+category1_choice.get(index).getPlaceName()+'\n'+
				"2. 추천메뉴: "+category1_choice.get(index).getPlaceBest()+'\n'+
				"3. 카테고리명: "+category1_choice.get(index).getCategoryName()+'\n'+
				"4. 세부카테고리: "+category1_choice.get(index).getCategoryDetail()+'\n'+
				"5. 주소: "+category1_choice.get(index).getRoadAddressName()
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(350, 125);
		story.setLocation(0, 375);
		story.setBackground(new Color(255,255,255));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		add(story);
		
		
		
		/*
		 * 맛집 둘러보기 다른 메뉴들로 새 창 띄우기 / 다음, 이전 버튼 기능
		 */
		
		//이전으로
		JButton btnBefore = new JButton("<< 이전");

		btnBefore.setBackground(new Color(255,255,255));
		btnBefore.setSize(100, 25);
		btnBefore.setLocation(5, 500);
		btnBefore.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		btnBefore.setForeground(Color.blue);
		btnBefore.setBorderPainted(false);
		btnBefore.setFocusPainted(false);
		add(btnBefore);

		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(FrameRestauntLookaraound.menu!=null) {
					ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, FrameRestauntLookaraound.menu);
					if(index==0)
						index=((category1_choice.size())-1);
					else 
						index--;	
					FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				}else {
					ArrayList<RestaurantDto> category1_choice = (ArrayList<RestaurantDto>) RestaurantDB.makeList();
					if(index==(category1_choice.size())-1)
						index=0;
					else 
						index++;	
					FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				}
			}
		});
		
		
		//다음으로
		JButton btnNext = new JButton("다음 >>");

		btnNext.setBackground(new Color(255,255,255));
		btnNext.setSize(100, 25);
		btnNext.setLocation((375-105), 500);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		btnNext.setForeground(Color.blue);
		btnNext.setBorderPainted(false);
		btnNext.setFocusPainted(false);
		add(btnNext);

		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(FrameRestauntLookaraound.menu!=null) {
					ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, FrameRestauntLookaraound.menu);
					if(index==(category1_choice.size())-1)
						index=0;
					else 
						index++;	
					FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				}else {
					ArrayList<RestaurantDto> category1_choice = (ArrayList<RestaurantDto>) RestaurantDB.makeList();
					if(index==(category1_choice.size())-1)
						index=0;
					else 
						index++;	
					FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
				}
			}
		});
		
		
		
		
		/*
		 * 최하단 버튼 설정
		 */
		ImageIcon home = new ImageIcon("홈으로.png");
		JButton btnHomeScreen = new JButton(home);
		btnHomeScreen.setBackground(new Color(255,192,203));
		btnHomeScreen.setSize(100, 100);
		btnHomeScreen.setLocation(10, 525);
		btnHomeScreen.setFont(new Font("굴림", Font.BOLD, 15));
		add(btnHomeScreen);
		
		ImageIcon reRecommand = new ImageIcon("추천맛집.png");
		JButton btnReRecommand = new JButton(reRecommand);
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReRecommand.setSize(100, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		btnReRecommand.setFont(new Font("굴림", Font.BOLD, 15));
		add(btnReRecommand);
		
		ImageIcon Reserve = new ImageIcon("예약하기.png");
		JButton btnReservation = new JButton(Reserve);
		btnReservation.setBackground(new Color(255,192,203));
		btnReservation.setSize(100, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + 115, 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("굴림", Font.BOLD, 15));
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
						FrameBase.getInstance(new FrameRestaurantCategory_random());	
					}	
				});	
		
			
			//--예약하기 버튼 액션
			btnReservation.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.getInstance(new RestaurantPayment(category1_choice.get(index)));
				}
			});	
			
			
			
//			if(FrameMovieSelect_random.menu!=null) {
//				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, FrameMovieSelect_random.menu);
//				FrameBase.getInstance(new RestaurantInfo(category1_choice));
//				//System.out.println(category1_choice);
//			}else {
//				RestaurantDto category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
//				FrameBase.getInstance(new RestaurantInfo(category1_choice));
//			}
			
			
		//음식점별 사진 다운
		//데이터 가공
		//창에서 음식+상세내용 출력
		//돌아가기
		//
		
		/*
		//데이터 생성자
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(0,0,255)); //파랑
		setLayout(null);
		setSize(375, 667);
		
		//상단의 뒤로가기 버튼
		JButton btnBack = new JButton("<< 뒤로가기");

		btnBack.setBackground(new Color(255,241,202)); //우리노랑
		btnBack.setSize(100, 25);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));
		btnBack.setForeground(Color.blue);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieSelect());
			}
		});
		
		
		
		//맛집 사진 출력
		ImageIcon choice_restaurant = new ImageIcon("맛집이표지.png");//r.getImg()
		JLabel lblmain_r = new JLabel(choice_restaurant);
		lblmain_r.setSize(200, 200);

		
		
		//맛집 정보 출력
		TextArea story = new TextArea("1. 가게명: "+category1_choice.get(0).getPlaceName()+'\n'+
				"2. 추천메뉴: "+category1_choice.get(0).getPlaceBest()+'\n'+
				"3. 카테고리명: "+category1_choice.get(0).getCategoryName()+'\n'+
				"4. 세부카테고리: "+category1_choice.get(0).getCategoryDetail()+
				'\n'+"5. 주소: "+category1_choice.get(0).getRoadAddressName());
		story.setSize(350, 150);
		story.setLocation(0, 200);
		story.setBackground(new Color(255,241,202));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

		
		//맛집2 이미지 출력
		ImageIcon choice_restaurant2 = new ImageIcon("맛집이표지.png");//r.getImg()
		JLabel lblmain_r2 = new JLabel(choice_restaurant2);
		lblmain_r2.setSize(200, 200);
		lblmain_r2.setLocation(-5, 350);

		
		
		
	
		
		//하단의 버튼 설정
		JButton btnHomeScreen = new JButton("처음으로");
		JButton btnReRecommand = new JButton("다시 추천받기");
		JButton btnReservation = new JButton("예약하기");

		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(375/3, 100);
		btnHomeScreen.setLocation(0, 0);
		
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
		btnPanel.add(btnReRecommand);
		btnPanel.add(btnReservation);
		add(btnPanel);
		
		//버튼 이벤트(처음으로 돌아가기 / 후기 남기기)
			btnHomeScreen.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameBegin());
					}
				});	
				
//			btnReRecommand.addActionListener(new ActionListener() {
//				
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						
//						if(FrameMovieSelect_random.menu!=null) {
//							ArrayList<RestaurantDto> category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, FrameMovieSelect_random.menu);
//							FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//							//System.out.println(category1_choice);
//						}else {
//							ArrayList<RestaurantDto> category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
//							FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//						}
//					}
//					
//					
//				});	
		
		//음식점별 사진 다운
		//데이터 가공
		//창에서 음식+상세내용 출력
		//돌아가기
		//
		*/
			
			
			
	}
}
