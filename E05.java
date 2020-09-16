//싱글톤
class DD{ 
	int x = 100;
	
	private DD() {} // 접근제어자 private + 생성자
	private static DD instance = new DD (); //DD와 DD를 참조한 참조변수 instance가 method 영역에 이미 올라와있다.
	
	public static DD getInstance() {
		return instance;
	}
	
}
public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DD d1 = new DD(); 선언되어잇기 때문에 필요가없다.
		//DD d2 = new DD();
		DD d1 = DD.getInstance(); // d1 과 d2는 동일한 개체를 참조. = 싱글톤.
		DD d2 = DD.getInstance();
		
		if(d1==d2)
		{ // ==는 정확히 두 객체 가 같으냐 ? 라는 뜻
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		
		if(d1.equals(d2)) { // 위치가 다르기 때문에 같지 않다 라고 한다.
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
	}

}
