package Grade2;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner times = new Scanner(System.in);
		System.out.print("게임 수 입력 : ");
		int cnt = times.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			System.out.print((i+1) + ":" );
			int[] num = new int[6];
			num[0] = times.nextInt();
			num[1] = times.nextInt();
			num[2] = times.nextInt();
			num[3] = times.nextInt();
			num[4] = times.nextInt();
			num[5] = times.nextInt();
			int[] lottonum = new int[7];
			
			for(int k = 0; k < lottonum.length; k++) {
				lottonum[k] =(int)(Math.random()*45+1);
			}
			
			int count = 0;
			boolean bonus = false;
			for(int j = 0; j<lottonum.length-2; j++) {
				if(num[0] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
				if(num[1] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
				if(num[2] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
				if(num[3] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
				if(num[4] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
				if(num[5] == lottonum[j]) {
					count++;
					if(num[0]==lottonum[lottonum.length-1]) {
						bonus = true;
					}
				}
			}
			System.out.print("당첨번호 : ");
			for(int o = 0; o < lottonum.length-1; o++) {
				System.out.print(lottonum[o]+" ");
			}System.out.println("보너스번호 == "+ lottonum[lottonum.length-1]);
			if(count==3) { //3개
				for(int o = 0; o < lottonum.length; o++) {
					System.out.println(i+num[o]+ " -- 5등");
				}
			}else if (count == 4) {
					System.out.print((i+1)+ " : ");
					for(int o = 0; o < lottonum.length-1; o++) {
						System.out.print(num[o]+ " ");
					}
					System.out.println("-- 4등");
				}else if (count == 5) {
					System.out.print((i+1)+ " : ");
					for(int o = 0; o < lottonum.length-1; o++) {
						System.out.print(num[o]+ " ");
					}
					System.out.println("-- 3등");
				}else if (count == 5 && bonus) {
					System.out.print((i+1)+ " : ");
					for(int o = 0; o < lottonum.length-1; o++) {
						System.out.print(num[o]+ " ");
					}
					System.out.println("-- 2등");
				}else if (count == 6) {
					System.out.print((i+1)+ " : ");
					for(int o = 0; o < lottonum.length-1; o++) {
						System.out.print(num[o]+ " ");
					}
					System.out.println("-- 1등");
				}else {
				System.out.print((i+1)+" : ");
				for(int o = 0; o < lottonum.length-1; o++) {
					System.out.print(num[o]+ " ");
				}
				System.out.println("--꽝");
			}
		}
	}
}
