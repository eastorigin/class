
public class CoffeeShopMain {

	public static void main (String[] args) {
		
		CoffeeShop tomAndToms = new CoffeeShop(5500, 5000, "아이스 아메리카노", "따듯한 아메리카노", 0.3);
//		tomAndToms.iceAmericano = 5500;
//		tomAndToms.hotAmericano = 5000;
		
		
		CoffeeShop mammoth = new CoffeeShop(1400, 1200, "저렴한 아아", "저렴한 뜨아", 0.2);
//		mammoth.iceAmericano = 1400;
//		mammoth.hotAmericano = 1200;
		
		
		int tomAndTomsIceAmericanoPrice = tomAndToms.orderCoffee(1, 10);
		int tomAndTomsHotAmericanoPrice = tomAndToms.orderCoffee(2, 5);
		
		System.out.println("탐탐 " + tomAndToms.iceAmericanoName + ": " + tomAndTomsIceAmericanoPrice);
		System.out.println("탐탐 " + tomAndToms.hotAmericanoName + ": " +tomAndTomsHotAmericanoPrice);
		
		int mammothIceAmericanoPrice = mammoth.orderCoffee(1, 10);
		int mammothHotAmericanoPrice = mammoth.orderCoffee(2, 5);
		
		System.out.println("메머도 " + mammoth.iceAmericanoName + ": " + mammothIceAmericanoPrice);
		System.out.println("메머도 " + mammoth.hotAmericanoName + ": " + mammothHotAmericanoPrice);
	}
}
