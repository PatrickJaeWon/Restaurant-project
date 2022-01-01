package restaurant;

import restaurant.RestaurantDto;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDB {


    private ArrayList<RestaurantDto> restaurantDtos;

    public RestaurantDB() {
        makeList();
    }

    public List<RestaurantDto> makeList(){

        restaurantDtos = new ArrayList<>();

        restaurantDtos.add(new RestaurantDto("샤오바오우육면", "중식", "중화요리", "02-723-7788",
                "서울 종로구 관철동 12-24", "우육면, 마라탕면", "서울 종로구 삼일대로17길 15", "http://place.map.kakao.com/2053098478",
                "2053098478","https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        restaurantDtos.add(new RestaurantDto("우육면관", "중식", "중화요리", "070-4213-5678",
                "서울 종로구 관철동 11-11", "우육면(특), 우육면", "서울 종로구 청계천로 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257","https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("갓덴스시", "일식", "초밥,롤", "02-730-1477",
                "서울 종로구 관철동 19-1", "점심 특선 초밥, 회전초밥", "서울 종로구 종로12길 14", "http://place.map.kakao.com/15204021",
                "15204021","https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("양연화로", "한식", "육류,고기", "02-3210-0808",
                "서울 종로구 관철동 13-5", "삼겹살, 특목살, 가브리살", "서울 종로구 삼일대로17길 18", "http://place.map.kakao.com/1619274444",
                "1619274444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("신도세기", "한식", "육류,고기", "02-739-8114",
                "서울 종로구 관철동 180", "SGP 통삽겹, SGP숄더랙", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/811272424",
                "811272424","http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        restaurantDtos.add(new RestaurantDto("롤링파스타", "양식", "이탈리안", "02-2261-5973",
                "서울 종로구 관철동 5-5", "크림 수프 파스타, 매운 크림 파스타", "서울 종로구 삼일대로 392", "http://place.map.kakao.com/829236335",
                "829236335","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("종로돈부리", "일식", "돈부리", "02-722-2384",
                "서울 종로구 관철동 7-15", "가츠동, 믹스가츠동, 규동", "서울 종로구 삼일대로 385", "http://place.map.kakao.com/24725107",
                "24725107","https://www.pooom.kr/uploads/ckeditor/42kag0HlD5GFWy8KO13am6eMU7Y-EroY.png"));
        restaurantDtos.add(new RestaurantDto("VIP참치", "일식", "참치회", "02-720-3888",
                "서울 종로구 관철동 11-13", "점심특선 참치 정식", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/149543887",
                "149543887","https://img.siksinhot.com/place/1497508460537945.jpg?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("황소고집", "한식", "육류,고기", "02-722-5747",
                "서울 종로구 관철동 11-11", "고추장 불고기 백반", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/8696442",
                "8696442","https://img.siksinhot.com/place/1508728090055419.jpg"));

        restaurantDtos.add(new RestaurantDto("쟁반집8292", "한식", "육류,고기", "0507-1389-8384",
                "서울 종로구 관철동 43-13", "고기정식, 두루치기", "서울 종로구 종로8길 17", "http://place.map.kakao.com/735673283",
                "735673283","https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("숙달돼지", "한식", "육류,고기", "02-737-5201",
                "서울 종로구 관철동 43-15", "국내산 숙성 통삼겹, 부대찌개", "서울 종로구 종로8길 15", "http://place.map.kakao.com/650374759",
                "650374759","https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        restaurantDtos.add(new RestaurantDto("남대문막내회집", "한식", "해물생선회", "02-737-5115",
                "서울 종로구 관철동 263", "활어회", "서울 종로구 우정국로 4-1", "http://place.map.kakao.com/13272050",
                "13272050","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211003060233274_photo_QGoV43fH37Pu.jpg"));

        restaurantDtos.add(new RestaurantDto("종로불돼지", "한식", "육류고기", "02-734-1190",
                "서울 종로구 관철동 155", "간돼지, 불돼지", "서울 종로구 청계천로 67", "http://place.map.kakao.com/17278908",
                "17278908","https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        restaurantDtos.add(new RestaurantDto("르브와", "양식", "이탈리안", "02-739-8208",
                "서울 종로구 관철동 19-11", "파스타, 리조또, 화덕피자", "서울 종로구 우정국로2길 42", "http://place.map.kakao.com/18283622",
                "18283622","https://scontent-gmp1-1.xx.fbcdn.net/v/t1.6435-9/p600x600/208400117_4169682433116220_3226403548786452970_n.jpg?_nc_cat=105&ccb=1-5&_nc_sid=a26aad&_nc_ohc=u_STXM-nNzwAX_ravNx&_nc_ht=scontent-gmp1-1.xx&oh=00_AT-Aewd0O4dJl1Z2C0a-iQOkPEgzdrpYmN4FsPzt97vajg&oe=61ECDF13"));

        restaurantDtos.add(new RestaurantDto("포탈라레스토랑", "아시아음식", "인도음식", "02-318-0094",
                "서울 종로구 관철동 35-2", "카레, 스프, 국수", "서울 종로구 청계천로 99", "http://place.map.kakao.com/11834063",
                "11834063","https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        restaurantDtos.add(new RestaurantDto("뚝배기집", "한식", "찌개전골", "02-2265-5744",
                "서울 종로구 관철동 5-1", "우렁된장, 된장찌개, 순두부", "서울 종로구 종로16길 12", "http://place.map.kakao.com/10374336",
                "10374336","https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("더피자필", "양식", "피자", "02-795-3283",
                "서울 종로구 관철동 42-4", "마르게리따, 페페로니, 슈프림", "서울 종로구 종로10길 21", "http://place.map.kakao.com/1397192634",
                "1397192634","http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        restaurantDtos.add(new RestaurantDto("장수촌", "한식", "해물생선장어", "02-722-3149",
                "서울 종로구 관철동 7-5", "장어 소금 구이, 바지락칼국수", "서울 종로구 삼일대로17길 8", "http://place.map.kakao.com/221545425",
                "221545425","https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        restaurantDtos.add(new RestaurantDto("신촌황소곱창", "한식", "곱창막창", "02-735-6698",
                "서울 종로구 관철동 12-23", "황소곱창, 대창, 막창", "서울 종로구 삼일대로17길 17", "http://place.map.kakao.com/9631798",
                "9631798","https://mblogthumb-phinf.pstatic.net/MjAyMDA2MTZfMjIw/MDAxNTkyMjg1MjE4NTcz.ICsyolrB0DA8SzHxY8kwUpkWwdTW_oag6uq7enjWgMAg.FNoAql_6ogIKA-eo3uIjh-gI2dMbKO7vSnJjgxp7uhYg.JPEG.mumumtour/%EC%86%8C%EA%B3%B1%EC%B0%BD_%EC%9D%BC%EC%83%81.jpg?type=w800"));
        
        //패스트푸드
        restaurantDtos.add(new RestaurantDto("쉐이크쉑", "패스트푸드", "햄버거", "02-2158-7575",
                "서울특별시 종로구 청진동 종로 33", "불고기버거", "서울특별시 종로구 청진동 종로 33", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTExMjhfNzEg%2FMDAxNjM4MDU5NzkzNTY0.exLLp04Q1XYfWVeWWYV2kZZlu7StQh-uRXDkxsUU0Kog.Dcmbrh_YfqKFxOwpw94NSy-ODnkgU1W41AZLxSRo_b4g.JPEG.hmdw1121103%2F20211126%25A3%25DF193306.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("플레이크", "패스트푸드", "햄버거", "02-734-1050",
                "서울특별시 종로구 관철동 155", "미국수제버거", "서울특별시 종로구 관철동 155", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTlfMjI5%2FMDAxNjI0MTAyNTM4NjQ4.3y6--orCIdUjpqaArZW7JWhMMaRnZCjyA-bpFky46HMg.40ugUTSlpHFHv5gefUURBi-sSwYWAccmHkdQncrMR4Ug.JPEG.zooyenzzang%2F20210601_121131.jpg&type=sc960_832"));

        restaurantDtos.add(new RestaurantDto("양키스버거", "패스트푸드", "햄버거", "0507-1441-0815",
                "서울특별시 종로구 삼일대로 30길 30", "더블버거", "서울특별시 종로구 삼일대로 30길 30", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MjRfODgg%2FMDAxNjIxODYyODA5Mzcx.z-FwpuMTVx_DMbknMm--W8KXWjncug5ym0Ks9c6Uat4g.gBfi9Hv1TzoijBHhkMj5Vo1tXriDk2SkbV8U88ef_GUg.JPEG.company4132%2FIMG_1076.JPG"));
        
        
        
        //샐러드
        restaurantDtos.add(new RestaurantDto("샐러디", "샐러드", "샐러드", "02-6956-7996",
                "서울 종로구 청계천로 61 청계천빌딩 6층", "칠리베이컨 웜볼", "서울 종로구 청계천로 61 청계천빌딩 6층", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMjlfNjAg%2FMDAxNjM1NDk0NjIwMDY0.IEyUlUdJcGjZzjm_TWQcDr7TCw9imT3b5OIRN4AKiIsg.yS2ny5cu2AP3OodfkgS2QyXDtUZM1Gz_15vDssqp_PEg.JPEG.jrue614%2FIMG_8819.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("어게인리프레쉬", "샐러드", "샐러드", "02-722-7717",
                "서울 종로구 삼일대로 383 2층", "연어&아포카도 샐러드", "서울 종로구 삼일대로 383 2층 6층", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MDRfMjcg%2FMDAxNTkxMjUxMTM3NTI1.U3cRulip3yCBm4TUyXgcogPTbWAAX6ZwS2uo7p2qfmEg.GRUHx3WAqggipprfTq4Ebjm9_uolOVmNuA1sp7psqVsg.JPEG.ghkwack%2FKakaoTalk_20200528_004359768_16.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("크리스피프레시", "샐러드", "샐러드", "02-6466-7180",
                "서울 중구 청계천로 24 케이스퀘어시티 1층", "비프 샐러드", "서울 중구 청계천로 24 케이스퀘어시티 1층", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20211101_256%2F1635767040697zb41s_JPEG%2Fupload_e09263ccc6e15bc0c88138a599c80549.jpeg"));
        
        
        return restaurantDtos;
    }
}