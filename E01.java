package Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Member{
	private int index;
	private String name;
	private int age;
	public Member() {}
	public Member(int idx, String name, int age) {
		this.index = idx;
		this.name = name;
		this.age = age;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return index+"\t"+name+"\t"+age;
	}
	
}

public class E01 {
	public static void main(String[] args) {
		List<Member> mList = new ArrayList<Member>();
		Member m = new Member(2,"BBB",30);
		mList.add(m);
		mList.add(new Member(1,"AAA",28));
		
		for(int i = 0; i <mList.size(); i++) {
			Member mem = mList.get(i);
			System.out.print(mem.getIndex()+"\t");
			System.out.print(mem.getName()+"\t");
			System.out.println(mem.getAge()+"\t");
		}
		System.out.println("===================================");
		for(int i = 0; i <mList.size(); i++) {
			Member mem = mList.get(i);
			System.out.println(mem);
		}
		//정렬
		//Collections.sort(mList);
	}

}
