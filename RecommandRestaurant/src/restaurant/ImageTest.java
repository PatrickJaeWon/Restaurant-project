package restaurant;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {
	
	public static int getRandomNumber(int size) {
		return new Random().nextInt(size);
	}
	
	public static RestaurantDto getRandomRestaurant(RestaurantDB RestaurantDB) {
		int i=getRandomNumber(RestaurantDB.makeList().size());
		//RestaurantDB.makeList().get(i).print();
		RestaurantDto x=RestaurantDB.makeList().get(i);
		return x;
	}

	public static void main(String[] args) {
		
		Frame f=new Frame();

		f.setBounds(300,100,650,500); //크기 단위 픽셀
		ImageIcon img=new ImageIcon("제주도.jpg");
		
		RestaurantDB x= new RestaurantDB();
		
		RestaurantDto y=getRandomRestaurant(x);
		
		ImageIcon choice_restaurant = new ImageIcon(HtmlUtils.imgHtmlParser(y.getImg()));
		JLabel lblmain_r = new JLabel(choice_restaurant);
		//lblmain_r.setSize(375, 345);
		lblmain_r.setSize(300, 300);
		lblmain_r.setLocation(-5, 67/2);
		
		JLabel ji=new JLabel(choice_restaurant); //JLabel에만 imageIcon사용 가능
		
		ji.setBounds(10,30,275,174);
		f.add(ji);
		
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		
	}

}
