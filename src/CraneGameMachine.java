import java.util.Random;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
		}
	}
	
	public int doGame() {
		if(isInsertCoin) {
			Random random = new Random();
			int number = random.nextInt(2);
			if(number == 1) {
				dolls--;
				isInsertCoin = false;
				return number;
			}else {
				isInsertCoin = false;
				return number;
			}
		}else {
			return -1;
		}
	}
	
	public static void main (String[] args) {
		CraneGameMachine start = new CraneGameMachine();
		start.dolls = 100;
		start.insertCoin();
		int result = start.doGame();
		if(result == 1) {
			System.out.println("인형 뽑기 성공");
		}else if(result == 0) {
			System.out.println("인형 뽑기 실패");
		} else {
			System.out.println("동전을 넣지 않았습니다");
		}
		System.out.println("인형 개수: " + start.dolls);
	}
}
