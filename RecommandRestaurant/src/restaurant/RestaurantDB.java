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

        restaurantDtos.add(new RestaurantDto("�����ٿ�������", "�߽�", "��ȭ�丮", "02-723-7788",
                "���� ���α� ��ö�� 12-24", "������, ��������", "���� ���α� ���ϴ��17�� 15", "http://place.map.kakao.com/2053098478",
                "2053098478","https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        restaurantDtos.add(new RestaurantDto("�������", "�߽�", "��ȭ�丮", "070-4213-5678",
                "���� ���α� ��ö�� 11-11", "������(Ư), ������", "���� ���α� û��õ�� 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257","https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("��������", "�Ͻ�", "�ʹ�,��", "02-730-1477",
                "���� ���α� ��ö�� 19-1", "���� Ư�� �ʹ�, ȸ���ʹ�", "���� ���α� ����12�� 14", "http://place.map.kakao.com/15204021",
                "15204021","https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        restaurantDtos.add(new RestaurantDto("�翬ȭ��", "�ѽ�", "����,���", "02-3210-0808",
                "���� ���α� ��ö�� 13-5", "����, Ư���, ���긮��", "���� ���α� ���ϴ��17�� 18", "http://place.map.kakao.com/1619274444",
                "1619274444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("�ŵ�����", "�ѽ�", "����,���", "02-739-8114",
                "���� ���α� ��ö�� 180", "SGP ����, SGP�����", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/811272424",
                "811272424","http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        restaurantDtos.add(new RestaurantDto("�Ѹ��Ľ�Ÿ", "���", "��Ż����", "02-2261-5973",
                "���� ���α� ��ö�� 5-5", "ũ�� ���� �Ľ�Ÿ, �ſ� ũ�� �Ľ�Ÿ", "���� ���α� ���ϴ�� 392", "http://place.map.kakao.com/829236335",
                "829236335","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        restaurantDtos.add(new RestaurantDto("���ε��θ�", "�Ͻ�", "���θ�", "02-722-2384",
                "���� ���α� ��ö�� 7-15", "������, �ͽ�������, �Ե�", "���� ���α� ���ϴ�� 385", "http://place.map.kakao.com/24725107",
                "24725107","https://www.pooom.kr/uploads/ckeditor/42kag0HlD5GFWy8KO13am6eMU7Y-EroY.png"));
        restaurantDtos.add(new RestaurantDto("VIP��ġ", "�Ͻ�", "��ġȸ", "02-720-3888",
                "���� ���α� ��ö�� 11-13", "����Ư�� ��ġ ����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/149543887",
                "149543887","https://img.siksinhot.com/place/1497508460537945.jpg?w=307&h=300&c=Y"));

        restaurantDtos.add(new RestaurantDto("Ȳ�Ұ���", "�ѽ�", "����,���", "02-722-5747",
                "���� ���α� ��ö�� 11-11", "������ �Ұ�� ���", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/8696442",
                "8696442","https://img.siksinhot.com/place/1508728090055419.jpg"));

        restaurantDtos.add(new RestaurantDto("�����8292", "�ѽ�", "����,���", "0507-1389-8384",
                "���� ���α� ��ö�� 43-13", "�������, �η�ġ��", "���� ���α� ����8�� 17", "http://place.map.kakao.com/735673283",
                "735673283","https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        restaurantDtos.add(new RestaurantDto("���޵���", "�ѽ�", "����,���", "02-737-5201",
                "���� ���α� ��ö�� 43-15", "������ ���� ����, �δ��", "���� ���α� ����8�� 15", "http://place.map.kakao.com/650374759",
                "650374759","https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        restaurantDtos.add(new RestaurantDto("���빮����ȸ��", "�ѽ�", "�ع�����ȸ", "02-737-5115",
                "���� ���α� ��ö�� 263", "Ȱ��ȸ", "���� ���α� �������� 4-1", "http://place.map.kakao.com/13272050",
                "13272050","https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211003060233274_photo_QGoV43fH37Pu.jpg"));

        restaurantDtos.add(new RestaurantDto("���κҵ���", "�ѽ�", "�������", "02-734-1190",
                "���� ���α� ��ö�� 155", "������, �ҵ���", "���� ���α� û��õ�� 67", "http://place.map.kakao.com/17278908",
                "17278908","https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        restaurantDtos.add(new RestaurantDto("�����", "���", "��Ż����", "02-739-8208",
                "���� ���α� ��ö�� 19-11", "�Ľ�Ÿ, ������, ȭ������", "���� ���α� ��������2�� 42", "http://place.map.kakao.com/18283622",
                "18283622","https://scontent-gmp1-1.xx.fbcdn.net/v/t1.6435-9/p600x600/208400117_4169682433116220_3226403548786452970_n.jpg?_nc_cat=105&ccb=1-5&_nc_sid=a26aad&_nc_ohc=u_STXM-nNzwAX_ravNx&_nc_ht=scontent-gmp1-1.xx&oh=00_AT-Aewd0O4dJl1Z2C0a-iQOkPEgzdrpYmN4FsPzt97vajg&oe=61ECDF13"));

        restaurantDtos.add(new RestaurantDto("��Ż�󷹽����", "�ƽþ�����", "�ε�����", "02-318-0094",
                "���� ���α� ��ö�� 35-2", "ī��, ����, ����", "���� ���α� û��õ�� 99", "http://place.map.kakao.com/11834063",
                "11834063","https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        restaurantDtos.add(new RestaurantDto("�ҹ����", "�ѽ�", "�����", "02-2265-5744",
                "���� ���α� ��ö�� 5-1", "�췷����, �����, ���κ�", "���� ���α� ����16�� 12", "http://place.map.kakao.com/10374336",
                "10374336","https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        restaurantDtos.add(new RestaurantDto("��������", "���", "����", "02-795-3283",
                "���� ���α� ��ö�� 42-4", "�����Ը���, ����δ�, ������", "���� ���α� ����10�� 21", "http://place.map.kakao.com/1397192634",
                "1397192634","http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        restaurantDtos.add(new RestaurantDto("�����", "�ѽ�", "�ع��������", "02-722-3149",
                "���� ���α� ��ö�� 7-5", "��� �ұ� ����, ������Į����", "���� ���α� ���ϴ��17�� 8", "http://place.map.kakao.com/221545425",
                "221545425","https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        restaurantDtos.add(new RestaurantDto("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-735-6698",
                "���� ���α� ��ö�� 12-23", "Ȳ�Ұ�â, ��â, ��â", "���� ���α� ���ϴ��17�� 17", "http://place.map.kakao.com/9631798",
                "9631798","https://mblogthumb-phinf.pstatic.net/MjAyMDA2MTZfMjIw/MDAxNTkyMjg1MjE4NTcz.ICsyolrB0DA8SzHxY8kwUpkWwdTW_oag6uq7enjWgMAg.FNoAql_6ogIKA-eo3uIjh-gI2dMbKO7vSnJjgxp7uhYg.JPEG.mumumtour/%EC%86%8C%EA%B3%B1%EC%B0%BD_%EC%9D%BC%EC%83%81.jpg?type=w800"));
        
        //�н�ƮǪ��
        restaurantDtos.add(new RestaurantDto("����ũ��", "�н�ƮǪ��", "�ܹ���", "02-2158-7575",
                "����Ư���� ���α� û���� ���� 33", "�Ұ�����", "����Ư���� ���α� û���� ���� 33", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTExMjhfNzEg%2FMDAxNjM4MDU5NzkzNTY0.exLLp04Q1XYfWVeWWYV2kZZlu7StQh-uRXDkxsUU0Kog.Dcmbrh_YfqKFxOwpw94NSy-ODnkgU1W41AZLxSRo_b4g.JPEG.hmdw1121103%2F20211126%25A3%25DF193306.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("�÷���ũ", "�н�ƮǪ��", "�ܹ���", "02-734-1050",
                "����Ư���� ���α� ��ö�� 155", "�̱���������", "����Ư���� ���α� ��ö�� 155", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTlfMjI5%2FMDAxNjI0MTAyNTM4NjQ4.3y6--orCIdUjpqaArZW7JWhMMaRnZCjyA-bpFky46HMg.40ugUTSlpHFHv5gefUURBi-sSwYWAccmHkdQncrMR4Ug.JPEG.zooyenzzang%2F20210601_121131.jpg&type=sc960_832"));

        restaurantDtos.add(new RestaurantDto("��Ű������", "�н�ƮǪ��", "�ܹ���", "0507-1441-0815",
                "����Ư���� ���α� ���ϴ�� 30�� 30", "�������", "����Ư���� ���α� ���ϴ�� 30�� 30", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MjRfODgg%2FMDAxNjIxODYyODA5Mzcx.z-FwpuMTVx_DMbknMm--W8KXWjncug5ym0Ks9c6Uat4g.gBfi9Hv1TzoijBHhkMj5Vo1tXriDk2SkbV8U88ef_GUg.JPEG.company4132%2FIMG_1076.JPG"));
        
        
        
        //������
        restaurantDtos.add(new RestaurantDto("������", "������", "������", "02-6956-7996",
                "���� ���α� û��õ�� 61 û��õ���� 6��", "ĥ�������� ����", "���� ���α� û��õ�� 61 û��õ���� 6��", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMjlfNjAg%2FMDAxNjM1NDk0NjIwMDY0.IEyUlUdJcGjZzjm_TWQcDr7TCw9imT3b5OIRN4AKiIsg.yS2ny5cu2AP3OodfkgS2QyXDtUZM1Gz_15vDssqp_PEg.JPEG.jrue614%2FIMG_8819.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("����θ�������", "������", "������", "02-722-7717",
                "���� ���α� ���ϴ�� 383 2��", "����&����ī�� ������", "���� ���α� ���ϴ�� 383 2�� 6��", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MDRfMjcg%2FMDAxNTkxMjUxMTM3NTI1.U3cRulip3yCBm4TUyXgcogPTbWAAX6ZwS2uo7p2qfmEg.GRUHx3WAqggipprfTq4Ebjm9_uolOVmNuA1sp7psqVsg.JPEG.ghkwack%2FKakaoTalk_20200528_004359768_16.jpg&type=sc960_832"));
        
        restaurantDtos.add(new RestaurantDto("ũ������������", "������", "������", "02-6466-7180",
                "���� �߱� û��õ�� 24 ���̽������Ƽ 1��", "���� ������", "���� �߱� û��õ�� 24 ���̽������Ƽ 1��", "http://place.map.kakao.com/149543887",
                "149543887","https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20211101_256%2F1635767040697zb41s_JPEG%2Fupload_e09263ccc6e15bc0c88138a599c80549.jpeg"));
        
        
        return restaurantDtos;
    }
}