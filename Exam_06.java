package test01;
/*키보드로 번호, 이름 , 점수를 입력받아서 학생객체를 생성 treeSet 저장후 출력
 * 입력: 1, 홍길동,55
 * 
 * 출력(번호순으로 출력)
 */

import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<Data> a = new TreeSet<Data>();
		
		int tot = 0;
		while(true) {
			String[] student = scn.nextLine().split(",");
			String b = student[0];
			int bun =Integer.parseInt(b);
			if(bun == 0) {
				break;
			}
			String name = student[1];
			int jum = Integer.parseInt(student[2]);
			
			/*System.out.print("입력하세요 : " );
			int bun = scn.nextInt();
			if(bun == 0) {
				break;
			}
			String name = scn.next();
			int jum = scn.nextInt();
			*/
			tot+=jum;
			//Data data = new Data(bun,name,jum);
			a.add(new Data(bun,name,jum));
		}
		float ave = (float)tot/a.size();
		
		Iterator<Data> k = (Iterator<Data>) a.iterator();
		
		while(k.hasNext()) {
			System.out.println("번호:" +k.next()+" 이름:"+k.next()+" 점수:"+k.next());
		}
		
		System.out.println("총점 :" + tot);
		System.out.println("평균 :" + ave);
		System.out.println("최대점수 학생");
		System.out.println();
		System.out.println("최소점수 학생");
		scn.close();
	}

}
