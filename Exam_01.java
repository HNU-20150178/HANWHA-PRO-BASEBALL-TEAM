/*
 * 로또번호 생성(1~45)
 */
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[6];
		for(int i = 0; i< 6; i++) {
			array[i]=(int)(Math.random()*10)+1;
			for(int j = 0; j<i; j++) {
				if(array[j] == array[i]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("===================================");
	}
}
