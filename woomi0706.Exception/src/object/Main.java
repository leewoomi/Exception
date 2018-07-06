package object;

public class Main {

	public static void main(String[] args) {

		Students stdnt = new Students();
		stdnt.setName("leewoomi");
		stdnt.setNum(14);
		stdnt.setGrade(3);

		// toString을 호출해서 출력
		// System.out.println(stdnt.toString());
		// System.out.println(stdnt);
		// object.Students@139a55->해시코드
		// object.Students@139a55

		// toString Overriding
		// Students [name=leewoomi, num=14번, grade=3학년]
		// Students [name=leewoomi, num=14번, grade=3학년]

		Students stdnt2 = new Students();
		stdnt2.setName("leewoomi");
		stdnt2.setNum(12);
		stdnt2.setGrade(1);

		System.out.println(stdnt == stdnt2);//false
		//==는 메모리의 값을 비교하는 비교 연산자
		
		System.out.println(stdnt.equals(stdnt2));//true
	}

}
