package exceptionhandling;

public class Main4 {

	public static void main(String[] args) {

		int a = 0;

		while (a == 0) {
			for (int i = 0; i < 3; i++) {
				System.out.println("image" + i + ".png");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
// image0.png,image1.png,image2.png
// 위 3개의 문자열 1초마다 번갈아가면서 무한 반복해서 출력하는 로직