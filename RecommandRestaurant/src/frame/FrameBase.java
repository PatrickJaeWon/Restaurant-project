package frame;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBase extends JFrame{

	private static FrameBase instance;

	private FrameBase(JPanel e) {
		//�ý��� ����(ȭ�� ũ�⸦ ��� ���� Toolkit)
		Toolkit tk = Toolkit.getDefaultToolkit();//�ػ�
		
		//�⺻ JFrame ����
		setTitle("���� ��õ ���α׷�");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				375, 667);
		getImage(e);//�⺻ ��� �̹���
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x��ư
	}//������

	//�̱��� ����� ����Ϸ��� �Ѵ�
	public static void getInstance(JPanel e) {
			//static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
			instance = new FrameBase(e);//�����ڸ� ���� �⺻ ������ ����
			
			instance.getContentPane().removeAll();
			instance.getContentPane().add(e);
			
			instance.revalidate(); //���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
			instance.repaint(); //���̾ƿ��� ���� �׸���
	}//getInstance()
	
	//�⺻ ������ �̹����� �����ϱ� ���� �޼ҵ�
	public static void getImage(JPanel e) {
		//ImageIcon backGround = new ImageIcon("./src/���1.png");
		ImageIcon iphone = new ImageIcon("iphone1.png");
		//ImageIcon imagebottom = new ImageIcon("./src/��ư.png");
		//JLabel lblBackGround = new JLabel(backGround);
		JLabel lblIphone = new JLabel(iphone);
		//JLabel lblImagebottom = new JLabel(imagebottom);
		//lblBackGround.setSize(400, 700);
		lblIphone.setSize(320, 600);
		//lblImagebottom.setSize(400, 700);
		lblIphone.setLocation(5, 5);
		//lblBackGround.setLocation(0, 0);
		//lblImagebottom.setLocation(0, 310);
		e.add(lblIphone);
		//e.add(lblImagebottom);
		//e.add(lblBackGround);
	}
	
}
