// 순위 구하기
public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		int[] score = {60,90,77,80,85,55,79,80};
		for(int x = 0; x<score.length;x++) {
			int r = 1;
			for(int y = 0; y<score.length; y++) {
				if(score[x]<score[y]) {
					r++;
				}
			}
		System.out.println(score[x]+ "->" +r);
		}
		
	*/
		int[] score = {60,90,77,80,85,55,79,80};
		for(int x = 0; x<score.length;x++) {
			int r = 1;
			System.out.print(score[x]+" -> ");
			for(int y = 0; y<score.length; y++) {
				if(score[x]<score[y]) {
					r++;
				}
			}
		}
	
	}

}
