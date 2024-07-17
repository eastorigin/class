
public class StudentScore {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	public double getAverage() {
		return getSumAllScores() / 4.0;
	}
	
	public double getCourseCredit() {
		if(getAverage() < 55) {
			return 0.1;
		}else {
			return (getAverage() - 55) / 10.0;
		}
	}
	
	public String getABCDEF() {
		if(getCourseCredit() >= 4.1) {
			return "A+";
		}else if(getCourseCredit() >= 3.6) {
			return "A";
		}else if(getCourseCredit()>= 3.1) {
			return "B+";
		}else if(getCourseCredit() >= 2.6) {
			return "B";
		}else if(getCourseCredit() >= 1.6) {
			return "C";
		}else if(getCourseCredit() >= 0.6) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public static void main (String[] args) {
		
		StudentScore student = new StudentScore(); // 특정 학생이라고 구체화 됐기 때문에 점수를 정의할 수 있다
		student.java = 63;
		student.python = 70;
		student.cpp = 80;
		student.csharp = 93;
		// 추상화 클래스를 구체화 한 후 정의 가능
		
		int sum = student.getSumAllScores();
		System.out.println("합계점수: " + sum);
		
		double average = student.getAverage();
		System.out.println("평균점수 " + average);
		
		double courseCredit = student.getCourseCredit();
		System.out.println("학점: " + courseCredit);
		
		String grade = student.getABCDEF();
		System.out.println("등급: " + grade);
	}
}
