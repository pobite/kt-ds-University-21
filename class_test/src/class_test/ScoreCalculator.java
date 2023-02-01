package class_test;

public class ScoreCalculator {
	
	/*
	 * 전역변수를
	 * 멤버변수 혹은 인스턴스 필드라 부름
	 * 
	 */
	
	int subjectA = 100;
	int subjectB = 90;
	int subjectC = 80;
	int subjectD = 70;
	
	
	public void getAverage() {
		
		int sum = subjectA + subjectB + subjectC + subjectD;
		double avg = sum / 4.0;
		System.out.println("평균은? " + avg);		
		
	}
	
	
	/**
	 * 성적 등급을 계산한다.
	 **/
	public void getGrade() {
		int sum = subjectA + subjectB + subjectC + subjectD;
		double avg = sum / 4.0;
		
		
		String grade = "";
		if (avg >= 90) {
			grade = "A";			
		}
		else if (avg >= 80) {
			grade = "B";			
		}
		else if (avg >= 70) {
			grade = "C";			
		}
		else if (avg >= 60) {
			grade = "D";			
		}
		else {
			grade = "F";
		}
	
		
		System.out.println("등급은? " + grade);
				
	}
		
}
