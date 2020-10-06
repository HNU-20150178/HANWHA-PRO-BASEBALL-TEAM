import java.util.Scanner;
/*
 * 판독 하는 문제
 * 10진수로 바꾸는 문제 10진수로 바꾸는건 parseint쓰면되고
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("2,8,16진수로 된 정수 입력 : ");
		String score = scn.nextLine();
		System.out.println("score는 "+score);
		for (int i =0; i<score.length();i++) {
			System.out.println(score.charAt(i));
			int data = score.charAt(i)-'0';
			if(data < 2) {
				System.out.println("2진수 "+score+"는"+"10진수 "+Integer.parseInt(score,2)+"입니다.");
				break;
			}
			if(data < 8) {
				System.out.println("2진수 "+score+"는"+"10진수 "+Integer.parseInt(score,2)+"입니다.");
				break;
			}
			if(score.charAt(i) == "A" || score.charAt(i) == "B" || score.charAt(i) == "C" || score.charAt(i) == "D" || score.charAt(i) == "E" || score.charAt(i) == "F" || score.charAt(i) == "G") {
				System.out.println("2진수 "+score+"는"+"10진수 "+Integer.parseInt(score,2)+"입니다.");
				break;
			}
		}
		
		scn.close();
	}

}
