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

//��õ_ī�װ� ���� ȭ��
public class FrameRestaurantCategory_random extends JPanel {
	//�����ڿ� ���� �߰�
	
	static String menu;
	
	public FrameRestaurantCategory_random() {
		RestaurantDB RestaurantDB=new RestaurantDB();
		
		//JPanel ����
		setBackground(new Color(255,255,255));
		setLayout(null);
		setSize(375, 667);

		//����� �ڷΰ��� ��ư
		JButton btnBack = new JButton("<<");

		btnBack.setBackground(new Color(255,255,255)); //�츮���
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
				FrameBase.getInstance(new FrameRecommandAlgorithm());
			}
		});
		
		
		JLabel subtitle=new JLabel("��õ�ް� ���� ī�װ��� �����ϼ���.");
		subtitle.setBounds((75/2)+50, 67/2, 250, 50);
		add(subtitle);
		
		
		
		//ī�װ�1(�ѽ�)�� ����
		ImageIcon cate1 = new ImageIcon("001.png");
		JButton btnCategory1 = new JButton(cate1);
		btnCategory1.setName("�ѽ�");
		btnCategory1.setBackground(new Color(255,192,203)); 
		btnCategory1.setSize(100,100);
		btnCategory1.setLocation((75/2)+25,(50+(67/2)));
		btnCategory1.setBorderPainted(false);
		btnCategory1.setFocusPainted(false);
		add(btnCategory1);
		
		
		btnCategory1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "�ѽ�");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="�ѽ�";
			}
		});
		
		
		//ī�װ�2(���)�� ����
		ImageIcon cate2 = new ImageIcon("002.png");
		JButton btnCategory2 = new JButton(cate2);
		btnCategory2.setName("���");
		btnCategory2.setBackground(new Color(255,192,203)); 
		btnCategory2.setSize(100,100);
		btnCategory2.setLocation((75/2)+175,(50+(67/2)));
		btnCategory2.setBorderPainted(false);
		btnCategory2.setFocusPainted(false);
		add(btnCategory2);
		
		btnCategory2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "���");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="���";
			}
		});
		
		
		
		//ī�װ�3(�߽�)�� ����
		ImageIcon cate3 = new ImageIcon("003.png");
		JButton btnCategory3 = new JButton(cate3);
		btnCategory3.setName("�߽�");
		btnCategory3.setBackground(new Color(255,192,203)); 
		btnCategory3.setSize(100,100);
		btnCategory3.setLocation((75/2)+25,(50+(67/2))+150);
		btnCategory3.setBorderPainted(false);
		btnCategory3.setFocusPainted(false);
		add(btnCategory3);
		
		btnCategory3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "�߽�");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="�߽�";
			}
		});
		
		
		
		
		//ī�װ�4(�Ͻ�)�� ����
		ImageIcon cate4 = new ImageIcon("004.png");
		JButton btnCategory4 = new JButton(cate4);
		btnCategory4.setName("�Ͻ�");
		btnCategory4.setBackground(new Color(255,192,203)); 
		btnCategory4.setSize(100,100);
		btnCategory4.setLocation((75/2)+175,(50+(67/2))+150);
		btnCategory4.setBorderPainted(false);
		btnCategory4.setFocusPainted(false);
		add(btnCategory4);
		
		btnCategory4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "�Ͻ�");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="�Ͻ�";
			}
		});
		
		
		//ī�װ�5(�н�Ʈ�ε�)�� ����
		ImageIcon cate5 = new ImageIcon("005.png");
		JButton btnCategory5 = new JButton(cate5);
		btnCategory5.setName("�н�ƮǪ��");
		btnCategory5.setBackground(new Color(255,192,203)); 
		btnCategory5.setSize(100,100);
		btnCategory5.setLocation((75/2)+25,(50+(67/2))+150+150);
		btnCategory5.setBorderPainted(false);
		btnCategory5.setFocusPainted(false);
		add(btnCategory5);
		
		btnCategory5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "�н�ƮǪ��");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="�н�ƮǪ��";
			}
		});
		
		
		//ī�װ�6(������)�� ����
		ImageIcon cate6 = new ImageIcon("006.png");
		JButton btnCategory6 = new JButton(cate6);
		btnCategory6.setName("������");
		btnCategory6.setBackground(new Color(255,192,203)); 
		btnCategory6.setSize(100,100);
		btnCategory6.setLocation((75/2)+175,(50+(67/2))+150+150);
		btnCategory6.setBorderPainted(false);
		btnCategory6.setFocusPainted(false);
		add(btnCategory6);
		
		btnCategory6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RestaurantDto category1_choice = getRandom.getRandomRestaurantByCategory(RestaurantDB, "������");
				FrameBase.getInstance(new RestaurantInfo(category1_choice));
				//FrameBase.getInstance(new test(category1_choice));
				menu="������";
			}
		});
		
		
		//ī�װ�7(��ü����)�� ����
		ImageIcon mdPick = new ImageIcon("md pick.png");
		JButton btnCategory7 = new JButton(mdPick);
		btnCategory7.setName("��ü����");
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
				Movie movie1 = new RestaurantDto().searchMovie("��󷣵�");
				FrameBase.getInstance(new FrameMovieInfo(movie1));
			}
		});
		
		
		//��ȭ2�� ����
		ImageIcon movie2 = new ImageIcon("���Ҽ����º��.jpg");
		JButton btnMovie2 = new JButton(movie2);
		btnMovie2.setName("���Ҽ����º��");

		btnMovie2.setSize(185,250);
		btnMovie2.setLocation(320,30);
		add(btnMovie2);

		btnMovie2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie2 = new RestaurantDto().searchMovie("���Ҽ����º��");
				FrameBase.getInstance(new FrameMovieInfo(movie2));
			}
		});

		//��ȭ3�� ����
		ImageIcon movie3 = new ImageIcon("�λ��̵�ƿ�.png");
		JButton btnMovie3 = new JButton(movie3);
		btnMovie3.setName("�λ��̵�ƿ�");

		btnMovie3.setSize(185,250);
		btnMovie3.setLocation(72,340);
		add(btnMovie3);

		btnMovie3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie3 = new RestaurantDto().searchMovie("�λ��̵�ƿ�");
				FrameBase.getInstance(new FrameMovieInfo(movie3));
			}
		});

		//��ȭ4�� ����
		ImageIcon movie4 = new ImageIcon("�ܿ�ձ�.png");
		JButton btnMovie4 = new JButton(movie4);
		btnMovie4.setName("�ܿ�ձ�");

		btnMovie4.setSize(185,250);
		btnMovie4.setLocation(320,340);
		add(btnMovie4);

		btnMovie4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie4 = new RestaurantDto().searchMovie("�ܿ�ձ�");
				FrameBase.getInstance(new FrameMovieInfo(movie4));
			}
		});

		//�ϴ��� ��ư
		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setLayout(null);
		bottomSet.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("�ڷΰ���");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 22));
		bottomSet.add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		JButton btnNext = new JButton("���� ������");

		btnNext.setBackground(new Color(0xA6A6A6));
		btnNext.setSize(183, 87);
		btnNext.setLocation(391, 0);
		btnNext.setFont(new Font("��������ڵ�", Font.BOLD, 22));
		bottomSet.add(btnNext);

		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//������������ �Ѿ�� ��� �������� �Ѵ�.
				//FrameMovieSelect2 Ŭ������ ���� 1���� �����ϰ� ���� ó��
				FrameBase.getInstance( new FrameMovieSelect2() );
			}
		});

		add(bottomSet, BorderLayout.SOUTH);
*/
	}//������
}
