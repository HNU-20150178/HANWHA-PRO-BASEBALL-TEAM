class Tv{
	String inch; // TV크기 25 , 65
	boolean power; // 전원  on -> true , off -> false; boolean의 기본 변수는 "FALSE"인걸 기억해라.
	int channel; // 채널 번호

	void power() {
		power = !power;
	}
	void channelUp(){
		if(power) {
			channel++;
			if(channel > 1000) {
				channel = 0;
			}
		}else {
			System.out.println("TV 전원을 켜세요");
		}
	}
	void channelDown() {
		if(power) {
			channel--;
			if(channel < 0) {
				channel = 999;
			}
		}else {
			System.out.println("TV 전원을 켜세요");
		}
	}

}
public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv1 = new Tv();
		System.out.println("TV 전원상태 : "+tv1.power);
		if(!tv1.power) {
			System.out.println("전원을 켤까요(y/n)");
			int onoff=1;
			if(onoff == 1) {
				tv1.power();
			}
		}
		if(tv1.power) {
			tv1.channelUp();
			System.out.println(tv1.channel);
			System.out.println("TV 전원상태 : "+tv1.power);
			tv1.channelDown();
			tv1.channelDown();
			System.out.println("TV 채널 상태 : "+tv1.channel);
		}

	}
}