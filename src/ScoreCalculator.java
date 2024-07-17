/**
 * 한 반의 학생들의 과목별 점수 총합
 * 		- 과목
 * 			- 국어
 * 			- 영어
 * 			- 수학
 * 반의 점수 평균
 * 
 * 한 반에 4명의 학생
 */
public class ScoreCalculator {

	public static void main (String[] args) {
		// 1번 학생의 국어 점수
		int korScore = 100;
		// 1번 학생의 영어 점수
		int engScore = 100;
		// 1번 학생의 수학 점수
		int mathScore = 100;
		
		// 1번 학생의 점수 총합
		int sumScore = korScore + engScore + mathScore;
		
		// 2번 학생의 국어 점수
		int korScore2 = 90;
		// 2번 학생의 영어 점수
		int mathScore2 = 90;
		// 2번 학생의 수학 점수
		int engScore2 = 90;
		
		// 2번 학생의 점수 총합
		int sumScore2 = korScore2 + mathScore2 + engScore2;
		
		// 3번 학생의 국어 점수
		int korScore3 = 90;
		// 3번 학생의 영어 점수
		int mathScore3 = 90;
		// 3번 학생의 수학 점수
		int engScore3 = 90;
		
		// 3번 학생의 점수 총합
		int sumScore3 = korScore3 + mathScore3 + engScore3;
		
		// 4번 학생의 국어 점수
		int korScore4 = 90;
		// 4번 학생의 영어 점수
		int mathScore4 = 90;
		// 4번 학생의 수학 점수
		int engScore4 = 90;
		
		// 4번 학생의 점수 총합
		int sumScore4 = korScore4 + mathScore4 + engScore4;
		
		int totalScore = sumScore + sumScore2 + sumScore3 + sumScore4;
		double average = totalScore / 4.0;
		
		System.out.println(average);


	}
}
