import java.util.Scanner;
import java.lang.Integer;

/* 10진수 입력 2, 8, 16 변환프로그램 작성
 * 입력 : 45
 * 변환 (2,8,16) : 2
 * 10진수 45는 2진수 xxxx입니다.
 */
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scn.nextInt();
		System.out.print("변환(2,8,16) : ");
		int whatnum = scn.nextInt();
		switch(whatnum) {
		case 2:
			System.out.println("10진수 "+num+"는"+whatnum+"진수 "+Integer.toBinaryString(num)+"입니다.");
			break;
		case 8:
			System.out.println("10진수 "+num+"는"+whatnum+"진수 "+Integer.toOctalString(num)+"입니다.");
			break;
		case 16:
			System.out.println("10진수 "+num+"는"+whatnum+"진수 "+Integer.toHexString(num)+"입니다.");
			break;
		}
		
			scn.close();
	}
}
