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

//�ѷ����� ȭ��, ī�װ����� �ϳ� ���ý� 
public class FrameRecommandAlgorithm extends JPanel {
	
	//�����ڿ� ���� �߰�
	public FrameRecommandAlgorithm() {
		RestaurantDB RestaurantDB=new RestaurantDB();
//		this.eventHandler();
		
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
				FrameBase.getInstance(new FrameBegin());
			}
		});
		
		
		//Ÿ��Ʋ ��
		JLabel q1=new JLabel("<HTML><body style='text-align:center;'>����� ���� �ְ��� �Ĵ��� ã������<br>�Ʒ� ������ �����ּ���!</body></HTML>"); //�ȳ�����ó�� �ٿ�������
		q1.setBounds(50,30, 300, 50);
		q1.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		add(q1);
		
		
		
		//�Ļ��ϴ� ����� �ִ��� ���� Ȯ��
		JLabel q2=new JLabel("<HTML><body style='text-align:center;'>�Բ� �Ļ��ϴ� ����� �ֳ���?</body></HTML>");
		q2.setBounds(75, 100, 250, 50);
		q2.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		
		JPanel s2=new JPanel();
		s2.setBounds(5, 150, 327, 60);
		//üũ�ڽ� �����
		JRadioButton chk1 = new JRadioButton("ģ��");
        JRadioButton chk2 = new JRadioButton("Ŀ��");
        JRadioButton chk3 = new JRadioButton("����");
        JRadioButton chk4 = new JRadioButton("����");
        JRadioButton chk5 = new JRadioButton("ȥ��");
        JRadioButton chk6 = new JRadioButton("������� ����");
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
		
		
		
		
		//��ȣ�ϴ� ������ Ȯ��
		JLabel q3=new JLabel("<HTML><body style='text-align:center;'>��ȣ�ϴ� �����Ⱑ �ֳ���?</body></HTML>");
		q3.setBounds(75, 250, 250, 50);
		q3.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		
		JPanel s3=new JPanel();
		s3.setBounds(5, 290, 327, 90);
		//üũ�ڽ� �����
		JCheckBox bt1 = new JCheckBox("��ź�ϴ�");
		JCheckBox bt2 = new JCheckBox("��ȭ�ο�");
		JCheckBox bt3 = new JCheckBox("��������");
		JCheckBox bt4 = new JCheckBox("������");
		JCheckBox bt5 = new JCheckBox("���������");
		JCheckBox bt6 = new JCheckBox("�����");
		JCheckBox bt7 = new JCheckBox("�����");
		JCheckBox bt8 = new JCheckBox("������");
		JCheckBox bt9 = new JCheckBox("������� ����");
          
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
	      
	      md.add("��ȣ�ϴ� ���� ����");
	      //md.add(" ");
	      md.add("������");
	      md.add("�����");
	      md.add("����������");
	      md.add("���þ���");
	      

	      
	      md.setSize(300,0);
	      md.setLocation(5,450);
	      md.setBackground(Color.pink);
	      md.setFont(new Font("���� �߳�ü", Font.BOLD, 13));

	      
	      add(md);
		
		
		//��� ���ݴ� ���� Ȯ��
		JLabel q4=new JLabel("<HTML><body style='text-align:center;'>����ϴ� ���ݴ밡 �ֳ���?</body></HTML>");
		q4.setBounds(75, 400, 250, 50);
		q4.setFont(new Font("��������ڵ�", Font.BOLD, 15));
		
		JPanel s4=new JPanel();
		s4.setBounds(5, 450, 327, 60);
		//üũ�ڽ� �����
		JRadioButton rad1 = new JRadioButton("1���� �̳�");
        JRadioButton rad2 = new JRadioButton("2���� �̳�");
        JRadioButton rad3 = new JRadioButton("3���� �̳�");
        JRadioButton rad4 = new JRadioButton("4���� �̳�");
        JRadioButton rad5 = new JRadioButton("5���� �̳�");
        JRadioButton rad6 = new JRadioButton("�� �̻�");
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
		
		
		
		//�������� ��ư
		ImageIcon viewNext = new ImageIcon("��������.png");
		JButton btnCategory7 = new JButton(viewNext);
		btnCategory7.setName("��������");
		btnCategory7.setSize(250,50);
		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
		btnCategory7.setBorderPainted(false);
		btnCategory7.setFocusPainted(false);
		add(btnCategory7);
		
		//->��ü���� ��ư�׼�
		btnCategory7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameRestaurantCategory_random());
			
			}
		});
		
		
		//========================
		
//		JLabel subtitle=new JLabel("����ϴ� ī�װ��� �����ϼ���");
//		subtitle.setBounds((75/2)+65, 67/2, 250, 50);
//		add(subtitle);
//		
//		//ī�װ�1(�ѽ�)�� ����
//		ImageIcon cate1 = new ImageIcon("001.png");
//		JButton btnCategory1 = new JButton(cate1);
//		btnCategory1.setName("�ѽ�");
//		btnCategory1.setBackground(new Color(255,192,203)); 
//		btnCategory1.setSize(100,100);
//		btnCategory1.setLocation((75/2)+25,(50+(67/2)));
//		btnCategory1.setBorderPainted(false);
//		
//		add(btnCategory1);
//		
//		//->�ѽ� ��ư�׼�
//		btnCategory1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "�ѽ�");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="�ѽ�";
//			}
//		});
//		
//		//ī�װ�2(���)�� ����
//		ImageIcon cate2 = new ImageIcon("002.png");
//		JButton btnCategory2 = new JButton(cate2);
//		btnCategory2.setName("���");
//		btnCategory2.setBackground(new Color(255,192,203)); 
//		btnCategory2.setSize(100,100);
//		btnCategory2.setLocation((75/2)+175,(50+(67/2)));
//		btnCategory2.setBorderPainted(false);
//		btnCategory2.setFocusPainted(false);
//		add(btnCategory2);
//		
//		//->��� ��ư�׼�
//		btnCategory2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "���");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="���";
//			}
//		});
//		
//		
//		
//		//ī�װ�3(�߽�)�� ����
//		ImageIcon cate3 = new ImageIcon("003.png");
//		JButton btnCategory3 = new JButton(cate3);
//		btnCategory3.setName("�߽�");
//		btnCategory3.setBackground(new Color(255,192,203)); 
//		btnCategory3.setSize(100,100);
//		btnCategory3.setLocation((75/2)+25,(50+(67/2))+150);
//		btnCategory3.setBorderPainted(false);
//		btnCategory3.setFocusPainted(false);
//		add(btnCategory3);
//		
//		//->�߽� ��ư�׼�
//		btnCategory3.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "�߽�");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="�߽�";
//			}
//		});
//		
//		
//		//ī�װ�4(�Ͻ�)�� ����
//		ImageIcon cate4 = new ImageIcon("004.png");
//		JButton btnCategory4 = new JButton(cate4);
//		btnCategory4.setName("�Ͻ�");
//		btnCategory4.setBackground(new Color(255,192,203)); 
//		btnCategory4.setSize(100,100);
//		btnCategory4.setLocation((75/2)+175,(50+(67/2))+150);
//		btnCategory4.setBorderPainted(false);
//		btnCategory4.setFocusPainted(false);
//		add(btnCategory4);
//		
//		//->�Ͻ� ��ư�׼�
//		btnCategory4.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "�߽�");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="�߽�";
//			}
//		});
//		
//		
//		
//		//ī�װ�5(�н�Ʈ�ε�)�� ����
//		ImageIcon cate5 = new ImageIcon("005.png");
//		JButton btnCategory5 = new JButton(cate5);
//		btnCategory5.setName("�н�ƮǪ��");
//		btnCategory5.setBackground(new Color(255,192,203)); 
//		btnCategory5.setSize(100,100);
//		btnCategory5.setLocation((75/2)+25,(50+(67/2))+150+150);
//		btnCategory5.setBorderPainted(false);
//		btnCategory5.setFocusPainted(false);
//		add(btnCategory5);
//		
//		//->�н�ƮǪ�� ��ư�׼�
//		btnCategory5.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "�н�ƮǪ��");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="�н�ƮǪ��";
//			}
//		});
//		
//		
//		//ī�װ�6(������)�� ����
//		ImageIcon cate6 = new ImageIcon("006.png");
//		JButton btnCategory6 = new JButton(cate6);
//		btnCategory6.setName("������");
//		btnCategory6.setBackground(new Color(255,192,203)); 
//		btnCategory6.setSize(100,100);
//		btnCategory6.setLocation((75/2)+175,(50+(67/2))+150+150);
//		btnCategory6.setBorderPainted(false);
//		btnCategory6.setFocusPainted(false);
//		add(btnCategory6);
//		
//		//->������ ��ư�׼�
//		btnCategory6.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = getRandom.getRestaurantByCategory(RestaurantDB, "������");
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu="������";
//			}
//		});
//		
//		
//		//ī�װ�7(��ü����)�� ����
//		ImageIcon viewAll = new ImageIcon("��ü����.png");
//		JButton btnCategory7 = new JButton(viewAll);
//		btnCategory7.setName("��ü����");
//		btnCategory7.setBackground(new Color(255,255,255)); //�츮���
//		btnCategory7.setSize(250,50);
//		btnCategory7.setLocation((75/2)+25,(50+(67/2))+150+150+150);
//		btnCategory7.setBorderPainted(false);
//		btnCategory7.setFocusPainted(false);
//		add(btnCategory7);
//		
//		//->��ü���� ��ư�׼�
//		btnCategory7.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ArrayList<RestaurantDto> category1_choice = (ArrayList<RestaurantDto>) RestaurantDB.makeList();
//				FrameBase.getInstance(new RestaurantInfoAll(category1_choice));
//				//FrameBase.getInstance(new test(category1_choice));
//				menu=null;
//			}
//		});
		
	}//������

}

