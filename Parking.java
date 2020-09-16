public class Parking {
	String carNo;
	int parkTime;
	int money;
	
	public Parking () {}
	public Parking (String carNo, int parkTime) {
		this.carNo = carNo;
		this.parkTime = parkTime;
		this.money = makeMoney(parkTime);
	}
	public int makeMoney(int parkTime){
		if (parkTime>=1440) {
			money = 30000;
		}
		else if (parkTime>=30) {
			int mok = parkTime/10;
			money = mok * 500 - 500;
		}
		else if(parkTime < 10) {
			money = 0;
		}
		else {
			money = 500;
		}
		return money;
	}
}