// 순위 구하기
public class E2 {

	public static void main(String[] args) {

		int[] score = {60,90,77,80,85,55,79,80};
		int[] rank = new int[score.length];
		
		for(int x = 0; x<score.length;x++) {
			//int r = 1;
			rank[x] = 1;
			for(int y = 0; y<score.length; y++) {
				if(score[x]<score[y]) {
					//r++;
					rank[x]++;
				}
			}
		}
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println("\n");
		for(int x = 0;x<rank.length;x++) {
			System.out.print(rank[x]+"\t");
		}
	}
}