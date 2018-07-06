package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int result = i / j;
			System.out.println(result);
		} catch (Exception e) {

		}
		System.out.println("예외 발생 후 실행");
	
	}

}
