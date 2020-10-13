//List -> ArrayList,Vector,LinkedList(비상연락망)

import java.util.*;
public class ListInterfaceexam01 {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // 기본값은 16개 허나 별로 의미는 없음 자기가 물려준것만 접근가능 대부분이렇게 접근(오브젝트)  
		
		ArrayList aList = new ArrayList(10); // 모두 접근 가능하다.(오브젝트)
		
		list.add(100);
		list.add("JAVA");
		list.add(3.14);
		list.add('A');
		list.add("김자바");
		
		System.out.println("List : " + list);
		list.add(1,"김자바");
		System.out.println("List : " + list);
		System.out.println(list.indexOf("김자바")); // g하나밖에 검사가 안되네?
		
		for(int i = 0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.print(obj+"\t");
		}
		
	}

}
