import java.util.Scanner;
public class E01 {
	public static void print(Parking[] park1, int cnt) {
		System.out.print("자돈차번호\t주차시간\t주차요금\n");
		for(int i = 0; i<cnt; i++) {
			System.out.println(park1[i].carNo + "\t" + park1[i].parkTime + "\t" + park1[i].money);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Parking[] park1 = new Parking[100]; //
		int cnt = 0;
		while(cnt<100) {
			System.out.print("주차정보 : ");
			String carNo = scn.next();
			if(carNo.equals("0000")) {
				break;
			}
			int parkTime = scn.nextInt();
			park1[cnt] = new Parking(carNo,parkTime);
			cnt++;
		}
		print(park1,cnt);
		scn.close();
	
	}

}
