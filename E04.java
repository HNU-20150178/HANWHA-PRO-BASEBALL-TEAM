
public class E04 {
	// 번호를 기준으로 오름차순 정렬 메소드
	static void scoreSort(int a[][]) {
		//선택정렬이라고 치면
		for(int x=0; x<a.length-1; x++) {
			for(int y = x+1; y<a.length; y++) {
				if(a[x][0]>a[y][0]) {
					for(int k=0; k<a[x].length; k++) {
						int temp = a[x][k];
						a[x][k]=a[y][k];
						a[y][k]=temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]= {{1,90,80,90,0},{5,77,69,50,0},{3,90,88,77,0},
				{2,90,80,90,0},{4,70,90,85,0}};
		
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x][0]+"\t");
			System.out.print(score[x][1]+"\t");
			System.out.print(score[x][2]+"\t");
			System.out.print(score[x][3]+"\n");
		}
		
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<4; y++) {
				System.out.print(score[x][y]+"\t");
			}
			
			System.out.print(score[x][4]+"\n");
		}
		System.out.println("-----------------번호로 정렬-------------------");
		scoreSort(score);
		
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<4; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
		}

}
