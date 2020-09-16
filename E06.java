// final, 상수
class FF{
	int s = 100;
	static final int MAX = 100; // final 이 붙으면 상수로 만들어버린다. *상수는 모든 철자를 대문자로 입력한다 
	final double PI = 3.14;//  new를 쓸 필요 없이 클래스 이름으로 바로 쓸 수 있어서 대부분 static final로 쓰인다.
	
}
public class E06 {

	public static void main(String[] args) {
		FF f = new FF();
		f.s=200;
	
		if(f.MAX<100) {
			
		}
	}

}
