package Test01;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int bun;
	private String name;
	private int score;
	Student(){}
	Student(int bun, String name, int score){
		this.bun=bun;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+score;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void dataSort(List<Student> list) {
		for(int x=0; x<list.size()-1; x++) {
			for(int y=x+1; y<list.size(); y++) {
				Student s1 = list.get(x);
				Student s2 = list.get(y);
				if(s1.bun>s2.bun) {
					list.set(x, s2);
					list.set(y, s1);
				}
			}
		}
	}
}


public class E02 {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(1,"aaa",99));
		sList.add(new Student(7,"bbb",88));
		sList.add(new Student(3,"ccc",77));
		sList.add(new Student(2,"ddd",66));
		sList.add(new Student(5,"fff",55));
		Student stu = new Student();
		// 1.전체 자료 출력
		for(int i = 0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		// 번호를 기준으로 오름차순 출력
		
		
		System.out.println();
		System.out.println("==================");
		System.out.println();
		for(int i = 0; i<sList.size()-1; i++) {
			for(int k = i+1; k<sList.size(); k++) {
				if(sList.get(i).getBun() > sList.get(k).getBun()) {
					Student imsi = sList.get(i);
					sList.set(i, sList.get(k));
					sList.set(k, imsi);
				}
			}
		}
		
		for(int i = 0; i<sList.size(); i++) {
			stu = sList.get(i);
			System.out.println(stu);
		}
	}

}
