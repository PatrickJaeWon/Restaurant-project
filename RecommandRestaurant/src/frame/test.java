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
	//������ ������
	data data=new data();
			
	ImageIcon choice_restaurant = new ImageIcon("������ǥ��.png");
	JLabel lblmain_r = new JLabel(choice_restaurant);
	
	// ��ư ���� ����
	JButton btnBack = new JButton("<< �ڷΰ���");
	JButton btnHomeScreen = new JButton("ó������");
	JButton btnReRecommand = new JButton("�ٽ� ��õ�ޱ�");
	JButton btnReservation = new JButton("�����ϱ�");
	
	TextArea story = new TextArea();
	public test(RestaurantDto r) {	
		// �⺻ UI ������
		this.init();
		
		// ���� ���� UI
		this.eventHandler();
		
		//���� ���� ���
		this.story = this.mTest(r);
		
	}
	
	private void init()
	{
		// ���ȭ�� ����
		setBackground(new Color(255,241,202));
		setLayout(null);
		setSize(375, 667);
		
		//����� �ڷΰ��� ��ư
		this.btnBack.setBackground(new Color(255,241,202));
		btnBack.setSize(100, 25);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 10));
		btnBack.setForeground(Color.blue);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		add(btnBack);
		
		// ��ư ������
		btnHomeScreen.setBackground(new Color(255,192,203)); 
		btnReRecommand.setBackground(new Color(255,192,203));
		btnReservation.setBackground(new Color(255,192,203));

		btnHomeScreen.setSize(375/3, 100);
		btnHomeScreen.setLocation(0, 525);
		
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
		add(btnReRecommand);
		add(btnReservation);	
	}
	
	private void eventHandler() {
		// Back��ư �̺�Ʈ �ڵ鷯
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameRestaurantCategory_random());
			}
		});
		
		// Home��ư �̺�Ʈ �ڵ鷯
		btnHomeScreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameMovieSelect Ŭ������ ���� �����Ƿ� ������ ����.
				FrameBase.getInstance(new FrameBegin());
			}
		});	
		
		// ReRecommand��ư �̺�Ʈ �ڵ鷯
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
		return new TextArea("1. ���Ը�: "+r.getPlaceName()+'\n'+"2. ��õ�޴�: "+r.getPlaceBest()+'\n'+
				"3. ī�װ���: "+r.getCategoryName()+'\n'+"4. ����ī�װ�: "+r.getCategoryDetail()+'\n'+"5. �ּ�: "+r.getRoadAddressName()
				,0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	}
	
	private void imageChange(ImageIcon i) {
		choice_restaurant = i;
	}
}
