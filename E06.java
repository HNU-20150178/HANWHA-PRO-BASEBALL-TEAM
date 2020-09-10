import java.util.Scanner;

//2차원 배열
public class E06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] bun = new int[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.print("입력:");
			bun[cnt] = scn.nextInt();
			if(bun[cnt] == -99) {
				break;
			}
			kor[cnt] = scn.nextInt();
			eng[cnt] = scn.nextInt();
			mat[cnt] = scn.nextInt();
			cnt++;
		}
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int i= 0; i<cnt;i++) {
			System.out.print(bun[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t");
			System.out.println(kor[i]+eng[i]+mat[i]);
		scn.close();	
		}
	}
}
