package exceptionhandling;

public class Main5 {

	public static void main(String[] args) {
		// 김기태, 이종범, 최향남, 이대진을 번갈아 가면서 출력

		String arr[] = { "김기태", "이종범", "최향남", "이대진" };
		int size = arr.length;
		int idx = 0;
		try {
			for (;;) {
				idx = idx % size;
				System.out.println(arr[idx]);
				idx += 1;
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//예외처리 권장사항
//반복문 안에서 사용하는 것은 바람직하지 않다.