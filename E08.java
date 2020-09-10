import java.util.Scanner;

//2차원 배열
public class E08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] hak = new int[10][4];
		int cnt = 0;
		
		while(true) {
			System.out.print("입력:");
			hak[cnt][0] = scn.nextInt();
			if(hak[cnt][0] == -99) {
				break;
			}
			hak[cnt][1] = scn.nextInt();
			hak[cnt][2] = scn.nextInt();
			hak[cnt][3] = scn.nextInt();
			cnt++;
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int i= 0; i<cnt;i++) {
			System.out.print(hak[i][0]+"\t"+hak[i][1]+"\t"+hak[i][2]+"\t"+hak[i][3]+"\t");
			System.out.println(hak[i][1]+hak[i][2]+hak[i][3]);
		scn.close();	
		}
	}
}
