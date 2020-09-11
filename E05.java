import java.util.Scanner;

/*
 * 키보드로 번호 이름 국어 영어 수학 점ㅅ ㅜ입력 총점, 평균율 구하여 출력
 * 1. 입력 형식
 * 학생 등록 : 3 김학생 90 80 90
 * 학생 등록 : 4 김학생 90 80 90 
 * 학생 등록 : 2 김학생 90 80 90 
 * 학생 등록 : 1 김학생 90 80 90
 * 학생 등록 : -99 -> 입력 종료
 * 
 * 2. 출력 형식 -1
 * 번호 이름 국어 영어 수학 총점 평균
 *  5 홍철  90 79 80 349 --
 *  3 . . . . . . . . . 
 *  
 *  3. 출력형식 -2 (총점을 기준으로 내림차순 출력)
 */
public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] printstudent = new int[10][5];
		String[] studentname = new String[10];
		double[] ave = new double[10];
		int cnt = 0;
		while(cnt<10) {
				System.out.print("학생 등록 : ");
				printstudent[cnt][0]=scanner.nextInt();
				if(printstudent[cnt][0]==-99) {
					System.out.println("입력종료"); 
					break;
				}
				studentname[cnt] = scanner.next();
				printstudent[cnt][1]= scanner.nextInt();
				printstudent[cnt][2]= scanner.nextInt();
				printstudent[cnt][3]= scanner.nextInt();
				printstudent[cnt][4]=printstudent[cnt][1]+printstudent[cnt][2]+printstudent[cnt][3];
				ave[cnt] = (printstudent[cnt][4])/3;
				cnt++;
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int x = 0; x<cnt; x++) {
			System.out.print(printstudent[x][0]+"\t");
			System.out.print(studentname[x]+"\t"); //이름출력
			for(int y = 1; y<printstudent[x].length;y++) {
				System.out.print(printstudent[x][y]+"\t");
				
			}
			System.out.print(ave[x]+"\n");//평점출력
		}
		//총점기준 오름차순 정렬

		//출력 -2
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int x= 0; x<cnt; x++) {
			System.out.print(printstudent[x][0]+"\t");
			System.out.println(studentname[x]+"\t");
		}

	}

}