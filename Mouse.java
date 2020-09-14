public class Mouse {
	//멤버변수(멤버필드) 정의
	String mColor; //마우스 색상
	int mButtons; // 마우스 버튼 수
	String system;  // 마우스 작동방식 (볼마우스 or 광마우스)
	
	// 기능(메소드) 정의
	public void onClick() {
		System.out.println(mColor+"마우스가 클릭되었습니다");
	}
	
	public String onDoubleClick() {
		String str =(mColor +"Mouse Double Click");
		return str;
	}
	
	public int onDrag() {
		int x = 100;
		return x+5;
	}
}
