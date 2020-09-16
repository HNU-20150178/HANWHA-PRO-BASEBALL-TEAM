import java.util.Scanner;

/*키보드로 번호, 이름, 나이 입력 배열에 저장 후 출력 (클래스배열)
 * [입력 형식]
 * 등록 : 1 이학생 28
 * 등록 : 5 진학생 21
 * 등록 : 2 김학생 30
 * .    .   .   .
 * 등록 : -99 ->  입력종료
 * [출력 형식 -1]  
 * 번호 이름 나이
 * 1  이학생 28
 * 5  진학생 21
 * 2  김학생 30
 * .   .   .
 * 
 * [출력 형식 -2] -> 번호를 기준으로 오름 차순 
 * 번호 이름 나이
 * 1  이학생 28
 * 2  김학생 30
 * 5  진학생 21
 * .   .   .
 * 
 */

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Student[] student1 = new Student[10];
		int cnt = 0;
		while(cnt<10) {
			System.out.println("학생등록 : ");
			int sNum = scn.nextInt(); //번호입력
			if(sNum == -99) {  // 종료조건
				break;
			}
			String sName = scn.next();
			int sAge = scn.nextInt();
			Student student = new Student(sNum,sName,sAge); //Student 클래스를 이용하여 참조변수 student 선언;
			student1[cnt]=student; // student에 저장된 값을 
			cnt++;
		}
		System.out.print("입력자료 출력 : -1");
		System.out.println("번호\t이름\t나이");
		for(int x = 0; x<cnt; x++) {
			student1[x].stuPrint();
		}
		scn.close();
		
		StudentData s = new StudentData();
		s.stuSort(student1, cnt);
		
		System.out.println("입력자료 출력 : -2");
		System.out.println("번호\t이름\t나이");
		for(int x = 0; x<cnt; x++) {
			student1[x].stuPrint();
		}
	}

}
