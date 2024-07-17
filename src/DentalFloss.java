
public class DentalFloss {
	
	/**
	 * 치실 두께
	 */
	double thickness;
	
	/**
	 * 치실 향
	 */
	String scent;
	
	/**
	 * 치실 길이
	 */
	double length;
	
	/**
	 * 치실 재질
	 */
	String material;
	
	/**
	 * 구강 청결
	 */
	public void cleanTeeth() {
		if(length > 0 && thickness >= 0.05 && thickness <= 0.2) {
			length--;
		}else if (length <= 0) {
			System.out.println("치실이 다 떨어짐");
		}else if(thickness < 0.05 || thickness > 0.2) {
			System.out.println("치실의 두께가 적절하지 않다");
		}
	}
	/**
	 * 구취 예방
	 */
	public void preventBadBreath() {
		if(length > 0 && thickness >= 0.05 && thickness <= 0.2) {
			length--;
			System.out.println(scent + "향이 난다");
		}else if (length <= 0) {
			System.out.println("치실이 다 떨어짐");
		}else if(thickness < 0.05 || thickness > 0.2) {
			System.out.println("치실의 두께가 적절하지 않다");
		}
	}
	
	/**
	 * 잇몸 건강 개선
	 */
	public void improveGumHealth() {
		if(length > 0 && thickness >= 0.05 && thickness <= 0.2) {
			length--;
		}else if (length <= 0) {
			System.out.println("치실이 다 떨어짐");
		}else if(thickness < 0.05 || thickness > 0.2) {
			System.out.println("치실의 두께가 적절하지 않다");
		}

	}
}
