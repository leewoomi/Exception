package object;

public class Students {

	// 이름, 번호, 학년을 저장할 변수
	private String name;
	private int num;
	private int grade;

	// 인스턴스 변수를 사용하기 위한 접근자 메소드 -getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// toString Overriding
	// 내부 데이터의 값을 빠르게 확인하기 위한 용도로 사용
	@Override
	public String toString() {
		return "Students [name=" + name + ", num=" + num + "번" + ", grade=" + grade + "학년" + "]";
	}

	//2개의 내용이 같은지 비교하는 메소드
	public boolean equals(Students other) {
		boolean result = false;
		//호출하는 인스턴스의 name과 매개변수의 name이 같으면
		//true를 리턴 그렇지 않으면 false를 리턴
		if(name.equals(other.name) && num==other.num) {
			result = true;
		}
		return result;
		
	}
	
}
