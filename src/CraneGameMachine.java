import java.util.Random;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
			doGame();
		}else {
			System.out.println(isInsertCoin);
		}
	}
	
	public int doGame() {
		if(isInsertCoin) {
			Random random = new Random();
			int number = random.nextInt(2);
			if(number == 1) {
				isInsertCoin = false;
				return dolls--;
			}else {
				isInsertCoin = false;
				return dolls;
			}
		}else {
			return dolls;
		}
	}
	
	public static void main (String[] args) {
		CraneGameMachine start = new CraneGameMachine();
		System.out.println(start.isInsertCoin);
		start.dolls = 0;
		start.insertCoin();
		System.out.println(start.dolls);
	}
}
