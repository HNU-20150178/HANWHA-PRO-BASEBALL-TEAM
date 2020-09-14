// 클래스를 정의할때 public class 클래스이름(첫문자는대문자) {...} 이 기본 규칙이다.

public class E01 {

	public static void main(String[] args) {
		int sum;//그냥 변수
		sum = 0;
		String str;// 리퍼런스(참조)변수
		str = "";
		
		Mouse m1; // 리퍼런스(참조)변수
		m1 = new Mouse(); //인스턴스화
		
		m1.mColor = "Red";
		m1.mButtons = 3;
		m1.system = "광마우스";
		System.out.println("마우스 색상 : "+m1.mColor);
		m1.onClick();
		m1.onDoubleClick();
		m1.onDrag();
		
		
		Mouse m2 = new Mouse(); //참조변수선언 + 인스턴스화
		m2.mColor = "Black";
		m2.onClick();
	}

}
