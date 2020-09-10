//가변배열
public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = {{1,2,3},{1},{1,2},{1,2,3,4},{1,2,3}};
		for(int x= 0; x<score.length;x++) {
			for(int y = 0; y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
			
			
		}
		
	}

}
