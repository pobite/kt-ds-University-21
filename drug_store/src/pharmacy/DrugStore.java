package pharmacy;

/**
 * 약국
 * @author User
 */

public class DrugStore {

	/**
	 * 감기환자
	 */
	Customer cold = new Customer();
	
	/**
	 * 콧물환자
	 */
	Customer runnyNose = new Customer();
	
	/**
	 * 근육통환자
	 */
	Customer musclePain = new Customer();

	/**
	 * 방문한다.
	 */
	public void visit() {
		cold.name = "장민창";
		cold.symptom = "감기";
		
		runnyNose.name = "홍길동";
		runnyNose.symptom ="콧물";
		
		musclePain.name = "철수";
		musclePain.symptom = "근육통";
	}

	/**
	 * 처방한다.
	 */
	public void prescribe() {
		
		/*
		 * 감기환자에게는 "이름"님, 감기증상 있으셔서 종합감기약 처방해 드립니다.
		 * 콧물환자에게는 "이름"님, 콧물증상 있으셔서 코막힘약 처방해 드립니다.
		 * 근육통환자에게는 "이름"님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.
		 */
		
		
		
		// 감기환자
		String customerSymptom = cold.symptom;

		if (customerSymptom.equals("감기")) {
			
			System.out.printf("%s님, 감기증상 있으셔서 종합감기약 처방해 드립니다.\n", cold.name);
			
		} else if (customerSymptom.equals("콧물")) {
			
			System.out.printf("%s님, 콧물증상 있으셔서 코막힘약 처방해 드립니다.\n", cold.name);
			
		} else {
			System.out.printf("%s님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.\n", cold.name);
		}
		
		
		// 콧물환자
		customerSymptom = runnyNose.symptom;

		if (customerSymptom.equals("감기")) {
			
			System.out.printf("%s님, 감기증상 있으셔서 종합감기약 처방해 드립니다.\n", runnyNose.name);
			
		} else if (customerSymptom.equals("콧물")) {
			
			System.out.printf("%s님, 콧물증상 있으셔서 코막힘약 처방해 드립니다.\n", runnyNose.name);
			
		} else {
			System.out.printf("%s님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.\n", runnyNose.name);
		}
		
		
		
		// 근육통
		customerSymptom = musclePain.symptom;

		if (customerSymptom.equals("감기")) {
			
			System.out.printf("%s님, 감기증상 있으셔서 종합감기약 처방해 드립니다.\n", musclePain.name);
			
		} else if (customerSymptom.equals("콧물")) {
			
			System.out.printf("%s님, 콧물증상 있으셔서 코막힘약 처방해 드립니다.\n", musclePain.name);
			
		} else {
			System.out.printf("%s님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.\n", musclePain.name);
		}
		
	}
	
}
