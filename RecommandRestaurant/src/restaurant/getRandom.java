package restaurant;

import java.util.ArrayList;
import java.util.Random;

public class getRandom {
	
	/*
	 * 전체 사이즈 중에서 랜덤 번호 추출
	 * @param size
	 * @return
	 */
	public static int getRandomNumber(int size) {
		return new Random().nextInt(size);
	}
	
	
	/*
	 * 종류별 맛집 중 랜덤하게 하나 데이터 추출
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
	 * 종류별 맛집 전체 데이터 추출
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
		//한식 종류의 식당 수를 받아 그 중 하나를 출력
        int num = getRandomNumber(categories.size());
        RestaurantDto x=categories.get(num);
		return x;
		
	}
	
	
	//카테고리를 선택했을때 그 맛집에 해당하는 맛집 리스트를 리턴
	public static ArrayList<RestaurantDto> getRestaurantByCategory(RestaurantDB RestaurantDB, String category) {
		ArrayList<RestaurantDto> categories=new ArrayList<RestaurantDto>();
		for(int i=0;i<RestaurantDB.makeList().size();i++) {
			if(RestaurantDB.makeList().get(i).getCategoryName().equals(category)) {
				categories.add(RestaurantDB.makeList().get(i));
			}
		}
		//한식 종류의 식당 전체를 반환
		return categories;
		
	}
	
	
}
