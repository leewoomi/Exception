package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {
		// java.lang.Thread라는 클래스는 sleep이라는 메소드가
		// 있는데 이 메소드는 매개변수로 대입된 시간만큼 실행을 중지 시키는 역할을 함
		// 이 메소드를 이용해서 1-10까지 1초씩 쉬면서 출력

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
