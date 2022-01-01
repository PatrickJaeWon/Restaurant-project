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
import restaurant.HtmlUtils;
import restaurant.RestaurantDB;
import restaurant.getRandom;

//���� �ϳ� ���� �� ���� ���
public class RestaurantInfo  extends JPanel{
	
	public RestaurantInfo(RestaurantDto r) {
		
		//������ ������
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);
		
		//����� �ڷΰ��� ��ư
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
		
		JLabel subtitle=new JLabel("����� ���� ��õ ����!");
		subtitle.setBounds(110, 1, 250, 50);
		subtitle.setForeground(Color.black);
		subtitle.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		add(subtitle);
		
		
		//���� ���� ���
		//ImageIcon choice_restaurant = new ImageIcon(HtmlUtils.imgHtmlParser(r.getImg()));//r.getImg()
		JLabel lblmain_r = new JLabel(HtmlUtils.imgHtmlParser(r.getImg()));
		lblmain_r.setSize(375, 345);
		lblmain_r.setLocation(5, 67/2);
		add(lblmain_r);
		
		
		
		//���� ���� ���
		TextArea story = new TextArea("1. ���Ը�: "+r.getPlaceName()+'\n'+
				"2. ��õ�޴�: "+r.getPlaceBest()+'\n'+
				"3. ī�װ���: "+r.getCategoryName()+'\n'+
				"4. ����ī�װ�: "+r.getCategoryDetail()+'\n'+"5. �ּ�: "+r.getRoadAddressName()
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(350, 150);
		story.setLocation(0, 375);
		story.setBackground(new Color(255,255,255));
		story.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		add(story);
		
		
		//�ϴ��� ��ư ����
		ImageIcon home = new ImageIcon("Ȩ����.png");
		JButton btnHomeScreen = new JButton(home);
		ImageIcon reRecommand = new ImageIcon("�ٽ���õ�ޱ�.png");
		JButton btnReRecommand = new JButton(reRecommand);
		ImageIcon reserve = new ImageIcon("�����ϱ�.png");
		JButton btnReservation = new JButton(reserve);

		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(100, 100);
		btnHomeScreen.setLocation(0, 525);
		
		btnHomeScreen.setFont(new Font("����", Font.BOLD, 15));
		
		btnReRecommand.setSize(100, 100);
		btnReRecommand.setLocation(
				(int) btnHomeScreen.getLocation().getX() + (375/3), 
				(int) btnHomeScreen.getLocation().getY());
		
		btnReRecommand.setFont(new Font("����", Font.BOLD, 15));
		
		btnReservation.setSize(100, 100);
		btnReservation.setLocation(
				(int) btnReRecommand.getLocation().getX() + (375/3), 
				(int) btnReRecommand.getLocation().getY());
		
		btnReservation.setFont(new Font("����", Font.BOLD, 15));
		
		add(btnHomeScreen);
		add(btnReRecommand);
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
						
						if(FrameRestaurantCategory_random.menu!=null) {
							RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, FrameRestaurantCategory_random.menu);
							FrameBase.getInstance(new RestaurantInfo(category1_choice));
							//System.out.println(category1_choice);
						}else {
							RestaurantDto category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
							FrameBase.getInstance(new RestaurantInfo(category1_choice));
						}
					}
					
					
				});	
			
			
			btnReservation.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.getInstance(new RestaurantPayment(r));
				}
			});	
			
			
			
			
		
		//�������� ���� �ٿ�
		//������ ����
		//â���� ����+�󼼳��� ���
		//���ư���
		//
		
	}
}
