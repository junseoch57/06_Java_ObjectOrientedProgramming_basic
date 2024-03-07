package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Product {
	
	// 클래스의 필드는 초깃값이 저장되어 있다.
	String code; 
	String name;
	String imgNm;
	int price;
	int deliveryPrice = 2500; // 필드에 초깃값을 지정할 수 있다.
	
	
}


public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		Member member = new Member();
		member.id = "aszd1111";
		member.name = "익명3";
		
		System.out.println("id : " + member.id);
		System.out.println("name : " + member.name);
		System.out.println();
		
		Product product = new Product();
		product.code = "0x01";
		product.name = "스마트 TV";
		product.imgNm = "스마트TV.PNG";
		product.price = 2500000;
		
		System.out.println("code : " + product.code);
		System.out.println("name : " + product.name);
		System.out.println("imgNm : " + product.imgNm);
		System.out.println("price : " + product.price);
		System.out.println("deliveryPrice : " + product.deliveryPrice);
		
	}

}
