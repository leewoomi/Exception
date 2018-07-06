package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Hello", "Leewoomi","이우미" };
		try {
			int size = arr.length;
			// size까지 진행해서 예외가 발생
			// java.lang.ArrayIndexOutOfBoundsException
			for (int i = 0; i < size; i++) {
			
				
				System.out.println(arr[i]);
				if(i<2) {
					throw new NumberFormatException("강제로 예외 발생");
				}
				//System.out.println(Integer.parseInt(arr[i]));// java.lang.NumberFormatException
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외 내용 출력
			System.out.println("ERROR : "+e.getMessage());
			// 예외 내용 추적
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부에 상관 없이 수행");
		}
	}

}
