
public class Floss {

	public static void main (String[] args) {
		
		DentalFloss glide = new DentalFloss();
		glide.length = 100;
		glide.thickness = 0.1;
		glide.scent = "민트";
		
		System.out.println(glide.length);
		
		glide.cleanTeeth();
		glide.preventBadBreath();
		glide.improveGumHealth();
		
		System.out.println(glide.length);
		
		glide.thickness = 0.5;
		
		glide.cleanTeeth();
		glide.preventBadBreath();
		glide.improveGumHealth();
		
		glide.thickness = 0.09;
		glide.length = 0;
		
		glide.cleanTeeth();
		glide.preventBadBreath();
		glide.improveGumHealth();
	}
}
