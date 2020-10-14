package Test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 키보드 입력
 * 입력 : id , name, age(user01,홍길동,35)
 * 
 * 출력 
 * 아이디    이름   나이
 * user01  윤  25
 * 
 */

public class Exam_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Mem> sList = new ArrayList<Mem>();
		int cnt = 0;
		while(true) {
			System.out.print("ID 이름  나이 :");
			String id = scn.next();
			if(id.equals("end")) {
				break;
			}
			String name = scn.next();
			int age = scn.nextInt();

			if(sList.contains(id)) {
				System.out.println("중복입니다");
				continue;
			}
			
			sList.add(new Mem(id,name,age));
			cnt++;
		}
		for(int i = 0; i<sList.size(); i++) {
			System.out.print(sList.get(i)+"\t");
		}
		
	}

}
