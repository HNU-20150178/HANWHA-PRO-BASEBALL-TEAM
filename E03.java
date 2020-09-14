class Student{
	int bun =1;
	String name ="김학생";
	int age = 31;
	/*int bun;
	String name;
	int age;
	//이건 묵시적인 초기화 값을 여기다가 넣으면 명시적인 초기화
	*/
	void print() {
		System.out.print("번호 : "+ bun+"\n");
		System.out.print("이름 : "+ name+"\n");
		System.out.print("나이 : "+ age+"\n");
	}
	
}
public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		System.out.println(student1);
		student1.print();
	
		Student student2 = new Student();
		System.out.println(student2);
		student2.bun =2;
		student2.name = "노홍철";
		student2.age = 28;
		student2.print();
		
		Student student3 = student1;
		System.out.println(student3);
		student3.print();
		
		
		
	
	}
	
	
	

}
