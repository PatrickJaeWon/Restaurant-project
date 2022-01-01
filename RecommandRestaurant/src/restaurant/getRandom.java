package restaurant;

import java.util.ArrayList;
import java.util.Random;

public class getRandom {
	
	/*
	 * ��ü ������ �߿��� ���� ��ȣ ����
	 * @param size
	 * @return
	 */
	public static int getRandomNumber(int size) {
		return new Random().nextInt(size);
	}
	
	
	/*
	 * ������ ���� �� �����ϰ� �ϳ� ������ ����
	 * @param RestaurantDB
	 */
	public static RestaurantDto getRandomRestaurant(RestaurantDB RestaurantDB) {
		int i=getRandomNumber(RestaurantDB.makeList().size());
		//RestaurantDB.makeList().get(i).print();
		RestaurantDto x=RestaurantDB.makeList().get(i);
		return x;
	}
	
	public static RestaurantDto getRestaurant(RestaurantDB RestaurantDB, int index) {
		//int i=getRandomNumber(RestaurantDB.makeList().size());
		//RestaurantDB.makeList().get(i).print();
		RestaurantDto x=RestaurantDB.makeList().get(index);
		return x;
	}
	
	
	
	
	/*
	 * ������ ���� ��ü ������ ����
	 * @param RestaurantDB, category
	 * @return
	 */
	public static RestaurantDto getRandomRestaurantByCategory(RestaurantDB RestaurantDB, String category) {
		ArrayList<RestaurantDto> categories=new ArrayList<RestaurantDto>();
		for(int i=0;i<RestaurantDB.makeList().size();i++) {
			if(RestaurantDB.makeList().get(i).getCategoryName().equals(category)) {
				categories.add(RestaurantDB.makeList().get(i));
			}
		}
		//�ѽ� ������ �Ĵ� ���� �޾� �� �� �ϳ��� ���
        int num = getRandomNumber(categories.size());
        RestaurantDto x=categories.get(num);
		return x;
		
	}
	
	
	//ī�װ��� ���������� �� ������ �ش��ϴ� ���� ����Ʈ�� ����
	public static ArrayList<RestaurantDto> getRestaurantByCategory(RestaurantDB RestaurantDB, String category) {
		ArrayList<RestaurantDto> categories=new ArrayList<RestaurantDto>();
		for(int i=0;i<RestaurantDB.makeList().size();i++) {
			if(RestaurantDB.makeList().get(i).getCategoryName().equals(category)) {
				categories.add(RestaurantDB.makeList().get(i));
			}
		}
		//�ѽ� ������ �Ĵ� ��ü�� ��ȯ
		return categories;
		
	}
	
	
}
