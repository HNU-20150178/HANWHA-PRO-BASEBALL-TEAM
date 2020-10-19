package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Student{
	private int sno;
	private String sname;
	
	public Student() {}
	public Student(int sno, String sname) {
		this.sno=sno;
		this.sname = sname;
	}
	@Override
	public int hashCode() {
		return sname.hashCode()+sno;
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			Student stu = (Student)obj;
			return (sno==stu.sno) && (sname.equals(stu.sname));
		}else {
			return false;
		}
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		Map<Student, Integer> sMap = new HashMap<Student, Integer>();
		sMap.put(new Student(1,"홍길동"), 100);
		sMap.put(new Student(5,"일길동"), 90);
		sMap.put(new Student(3,"이길동"), 80);
		sMap.put(new Student(2,"삼길동"), 70);
		sMap.put(new Student(4,"사길동"), 60);
		sMap.put(new Student(6,"오길동"), 50);
		sMap.put(new Student(8,"육길동"), 40);
		sMap.put(new Student(7,"칠길동"), 30);
		
		System.out.println(sMap.size());
		// 1. 키보드로 번호, 이름을 입력 Student 객체를 생성
		// Map에 저장된 객체를 찾아서 출력 찾는 객체가 없을 경우 " 등록된 자료 없음" 출력
		
		// 2. 점수 합계를 구하여 출력
		
		// 3. 점수의 최대값, 최소값을 찾아서 출력
		Scanner scn = new Scanner(System.in);
		Student mystu = new Student();
		while(true) {
			System.out.println("찾으실 번호와 이름을 입력하세요 : ");
			int no = scn.nextInt();
			if(no == 0) {
				break;
			}
			String name = scn.next();
			int sum = 0;
			int least = 899;
			int biggest = -1; 
			
			mystu.setSno(no);
			mystu.setSname(name);
			
			for(Entry<Student, Integer> entry : sMap.entrySet()) {
			    sum+=entry.getValue();
			    if(least > entry.getValue()) {
			    	least = entry.getValue();
			    }
			    if(biggest < entry.getValue()) {
			    	biggest = entry.getValue();
			    }
			}
			
			
			String sname = mystu.getSname();
			
			if(true) {
				Entry<Student, Integer> myentry = sMap.entrySet();
				System.out.println(sMap.get(mystu));
				System.out.println("총점은 : " + sum);
				System.out.println("최대값은 : " + biggest);
				System.out.println("최소값은 : " + least);
			}
			
			
		}
		
	}

}
