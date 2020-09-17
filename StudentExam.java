package com.jslhrd.exam;

import java.util.Scanner;

/* 키보드로 번호, 이름, 국어, 영어 ,수학 입력 Student 객체를 생성 배열에 저장
 * 입력
 * 등록 : 1 aaa 90 80 80
 * 등록 : 1 5 90 80 80
 * 등록 : 1 aaa 90 80 80
 * 등록 : -99 -> 종료
 * 출력형식 -1
 * 번호 이름 총점 평균    석차
 * 1   aa xx  xx.x x
 * 
 * 출력형식 -2
 * 번호 이름 총점 평균 석차
 * 1 aa xx xx.x  xx
 * 
 */

public class StudentExam {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int cnt = 0;
	while(cnt<10) {
		System.out.print("등록");
		int bun = scn.nextInt();
		if(bun == -99) {
			break;
		}
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int math = scn.nextInt();
		int tot = kor+eng+math;
		StudentData.student[cnt]=new Student(bun,name,tot);
		cnt++;
	}
	StudentData.count = cnt;
	for(int i=0; i<cnt; i++) {
		System.out.println("번호\t이름\t총점\t평균\t석차");
		System.out.print(StudentData.student[i].getBun()+"\t");
		System.out.print(StudentData.student[i].getName()+"\t");
		System.out.print(StudentData.student[i].getTot()+"\t");
		System.out.println(StudentData.student[i].getAve()+"\t");
	}
	
	}

}
