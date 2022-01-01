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

//���� �ѷ����� �ϳ���
public class RestaurantInfoAll  extends JPanel{
	
	static int index=0;
	
	public RestaurantInfoAll(ArrayList<RestaurantDto> category1_choice) {
		
		//������ ������
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);
		
		/*
		 * �ڷΰ��� ��ư
		 */
		JButton btnBack = new JButton("<<");

		btnBack.setBackground(new Color(255,255,255));
		btnBack.setSize(80, 25);
		btnBack.setLocation(5, 5);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 15));
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
		 * ����� ���� ��õ ���� ��
		 */
//		JLabel subtitle=new JLabel("����� ���� ��õ ����!");
//		subtitle.setBounds(110, 1, 250, 50);
//		subtitle.setForeground(Color.black);
//		subtitle.setFont(new Font("��������ڵ�", Font.BOLD, 15));
//		add(subtitle);
		
		
		/*
		 * ���� ���� ���_����
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
		 * ���� ���� ���_�ؽ�Ʈ
		 */
		TextArea story = new TextArea("1. ���Ը�: "+category1_choice.get(index).getPlaceName()+'\n'+
				"2. ��õ�޴�: "+category1_choice.get(index).getPlaceBest()+'\n'+
				"3. ī�װ���: "+category1_choice.get(index).getCategoryName()+'\n'+
				"4. ����ī�װ�: "+category1_choice.get(index).getCategoryDetail()+'\n'+
				"5. �ּ�: "+category1_choice.get(index).getRoadAddressName()
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(350, 125);
		story.setLocation(0, 375);
		story.setBackground(new Color(255,255,255));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		add(story);
		
		
		
		/*
		 * ���� �ѷ����� �ٸ� �޴���� �� â ���� / ����, ���� ��ư ���
		 */
		
		//��������
		JButton btnBefore = new JButton("<< ����");

		btnBefore.setBackground(new Color(255,255,255));
		btnBefore.setSize(100, 25);
		btnBefore.setLocation(5, 500);
		btnBefore.setFont(new Font("��������ڵ�", Font.BOLD, 15));
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
		
		
		//��������
		JButton btnNext = new JButton("���� >>");

		btnNext.setBackground(new Color(255,255,255));
		btnNext.setSize(100, 25);
		btnNext.setLocation((375-105), 500);
		btnNext.setFont(new Font("��������ڵ�", Font.BOLD, 15));
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
		 * ���ϴ� ��ư ����
		 */
		ImageIcon home = new ImageIcon("Ȩ����.png");
		JButton btnHomeScreen = new JButton(home);
		btnHomeScreen.setBackground(new Color(255,192,203));
		btnHomeScreen.setSize(100, 100);
		btnHomeScreen.setLocation(10, 525);
		btnHomeScreen.setFont(new Font("����", Font.BOLD, 15));
		add(btnHomeScreen);
		
		ImageIcon reRecommand = new ImageIcon("��õ����.png");
		JButton btnReRecommand = new JButton(reRecommand);
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReRecommand.setSize(100, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		btnReRecommand.setFont(new Font("����", Font.BOLD, 15));
		add(btnReRecommand);
		
		ImageIcon Reserve = new ImageIcon("�����ϱ�.png");
		JButton btnReservation = new JButton(Reserve);
		btnReservation.setBackground(new Color(255,192,203));
		btnReservation.setSize(100, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + 115, 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("����", Font.BOLD, 15));
		add(btnReservation);
		
		//��ư �̺�Ʈ(ó������ ���ư��� / �ı� �����)
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
		
			
			//--�����ϱ� ��ư �׼�
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
			
			
		//�������� ���� �ٿ�
		//������ ����
		//â���� ����+�󼼳��� ���
		//���ư���
		//
		
		/*
		//������ ������
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(0,0,255)); //�Ķ�
		setLayout(null);
		setSize(375, 667);
		
		//����� �ڷΰ��� ��ư
		JButton btnBack = new JButton("<< �ڷΰ���");

		btnBack.setBackground(new Color(255,241,202)); //�츮���
		btnBack.setSize(100, 25);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 10));
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
		
		
		
		//���� ���� ���
		ImageIcon choice_restaurant = new ImageIcon("������ǥ��.png");//r.getImg()
		JLabel lblmain_r = new JLabel(choice_restaurant);
		lblmain_r.setSize(200, 200);

		
		
		//���� ���� ���
		TextArea story = new TextArea("1. ���Ը�: "+category1_choice.get(0).getPlaceName()+'\n'+
				"2. ��õ�޴�: "+category1_choice.get(0).getPlaceBest()+'\n'+
				"3. ī�װ���: "+category1_choice.get(0).getCategoryName()+'\n'+
				"4. ����ī�װ�: "+category1_choice.get(0).getCategoryDetail()+
				'\n'+"5. �ּ�: "+category1_choice.get(0).getRoadAddressName());
		story.setSize(350, 150);
		story.setLocation(0, 200);
		story.setBackground(new Color(255,241,202));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

		
		//����2 �̹��� ���
		ImageIcon choice_restaurant2 = new ImageIcon("������ǥ��.png");//r.getImg()
		JLabel lblmain_r2 = new JLabel(choice_restaurant2);
		lblmain_r2.setSize(200, 200);
		lblmain_r2.setLocation(-5, 350);

		
		
		
	
		
		//�ϴ��� ��ư ����
		JButton btnHomeScreen = new JButton("ó������");
		JButton btnReRecommand = new JButton("�ٽ� ��õ�ޱ�");
		JButton btnReservation = new JButton("�����ϱ�");

		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(375/3, 100);
		btnHomeScreen.setLocation(0, 0);
		
		btnHomeScreen.setFont(new Font("����", Font.BOLD, 15));
		
		btnReRecommand.setSize(375/3, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		
		btnReRecommand.setFont(new Font("����", Font.BOLD, 15));
		
		btnReservation.setSize(375/3, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + (375/3), 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("����", Font.BOLD, 15));
		
		add(btnHomeScreen);
		btnPanel.add(btnReRecommand);
		btnPanel.add(btnReservation);
		add(btnPanel);
		
		//��ư �̺�Ʈ(ó������ ���ư��� / �ı� �����)
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
		
		//�������� ���� �ٿ�
		//������ ����
		//â���� ����+�󼼳��� ���
		//���ư���
		//
		*/
			
			
			
	}
}
