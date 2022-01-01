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

//���õ� ���� �����ϱ� ȭ��
public class RestaurantPayment  extends JPanel{
	
	public RestaurantPayment(RestaurantDto r) {
		
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
		
		JLabel subtitle=new JLabel("�����ϱ�");
		subtitle.setBounds(150, 1, 250, 50);
		subtitle.setForeground(Color.black);
		subtitle.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		add(subtitle);
		
		
		//���� ���� ���
		//ImageIcon choice_restaurant = new ImageIcon(HtmlUtils.imgHtmlParser(r.getImg()));//r.getImg()
		JLabel lblmain_r = new JLabel(HtmlUtils.imgHtmlParser(r.getImg()));
		lblmain_r.setSize(375, 345);
		lblmain_r.setLocation(5, 67/2);
		add(lblmain_r);
		

		
		Choice reserveTime = new Choice();
		long time = System.currentTimeMillis();

		SimpleDateFormat dayTime = 
			new SimpleDateFormat("MM�� dd��(EE)");//(EE:����)

		String str = dayTime.format( new Date(time) );

		String[] timeSlot = { 
				"����ð� ����", 
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

		reserveTime.setFont(new Font("��������ڵ�", Font.PLAIN, 13));
		reserveTime.setSize(240, 100);
		reserveTime.setLocation(155, 415);
		
		add(reserveTime);
		
		
		
		
		Choice reserveNumber = new Choice();
		reserveNumber.add("1��");
		reserveNumber.add("2��");
		reserveNumber.add("3��");
		reserveNumber.add("4��");
		reserveNumber.add("5��");
		reserveNumber.add("6��");
		reserveNumber.add("7��");
		reserveNumber.add("8��");
		
		reserveNumber.setFont(new Font("��������ڵ�", Font.PLAIN, 13));
		reserveNumber.setSize(150, 100);
		reserveNumber.setLocation(100, 415+20);
		
		add(reserveNumber);
		
		
		
		//���� ���� ���
		TextArea story = new TextArea("1. ���Ը�: "+r.getPlaceName()+'\n'+
				"2. ���డ�ɿ���: "+"����"+'\n'+
				"3. ��� ����ð�: "+'\n'+
				"4. �ο���: "+'\n'
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
							FrameBase.getInstance(new RestaurantPayment(category1_choice));
							//System.out.println(category1_choice);
						}else {
							RestaurantDto category1_choice = getRandom.getRandomRestaurant(RestaurantDB);
							FrameBase.getInstance(new RestaurantPayment(category1_choice));
						}
					}
					
					
				});	
			
			
			//�����ϱ� ��ư ��ȿ�� üũ
			btnReservation.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (reserveTime.getSelectedItem().equals("����ð� ����")) {
						JOptionPane.showMessageDialog(
								null, "�ð��� ������ �ּ���");
					} else {
						JOptionPane.showMessageDialog(null,"1. ���Ը�: "+r.getPlaceName()+'\n'+
							"2. ��� ����ð�: "+reserveTime.getSelectedItem()+'\n'+
							"3. �ο���: "+reserveNumber.getSelectedItem()+'\n'+"���� ������ �Ϸ�Ǿ����ϴ�.");
					}
				}
			});//addActionListener
		
		//�������� ���� �ٿ�
		//������ ����
		//â���� ����+�󼼳��� ���
		//���ư���
		//
		
	}
}
