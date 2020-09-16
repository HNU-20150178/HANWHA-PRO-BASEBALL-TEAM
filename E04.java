// 정적 멤버 (static)
class BB{
	static int a; // 멤버변수
	
	static { // 정적초기화블럭
		
	} 
	public void test() {
		System.out.println("a="+a);
	}
}
public class E04 {

	public static void main(String[] args) {
	
		BB b1 = new BB();
		BB b2 = new BB();
		
		b1.test();
		b2.test();
	}

}
