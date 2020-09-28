import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while(cnt < 10) {
			System.out.print("자료입력 : ");
			String ak = scn.nextLine();
			if(ak.equalsIgnoreCase("end")) {
				break;
			}
			String [] am = ak.split(",");
		
			MemberData.member[cnt] = new Member(am[0],am[1],am[2]);
			cnt++;
			MemberData.count=cnt; 
		}
		System.out.println("이름\t전화\t성별\t나이");
	for(int i =0;i<MemberData.count;i++) {
		System.out.print(MemberData.member[i].getName()+"\t");
		System.out.print(MemberData.member[i].getPhoneNum()+"\t");
		System.out.print(MemberData.member[i].getSexS()+"\t");
		System.out.print(MemberData.member[i].getAge());
	}
		scn.close();
	}
}
