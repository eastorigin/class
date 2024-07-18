
public class CoffeeShop {

	String iceAmericanoName;
	String hotAmericanoName;
	int iceAmericano; // 멤버변수
	int hotAmericano;
	double discountRatio;
	
	public CoffeeShop (int iceAmericano, int hotAmericano, String iceAmericanoName, String hotAmericanoName, double discountRatio) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
		this.iceAmericanoName = iceAmericanoName;
		this.hotAmericanoName = hotAmericanoName;
		this.discountRatio = discountRatio;
	}
	
	public int orderCoffee(int menu, int quantity) {
		
		if(menu == 1) {
			return this.iceAmericano * quantity;
			// this를 붙이는 이유는 멤버변수라는 것을 알려주기 위해
			// 안 붙여도 결과는 동일함
		}
		
		return this.hotAmericano * quantity;
	}
}
