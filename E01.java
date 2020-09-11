
public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[5][5]; // 이럴떄 다중 for 문
		int cnt = 0;
		for(int x = 0; x<a.length;x++) {
			for(int y = 0; y<a[x].length; y++) {
				cnt++;
				a[x][y]=cnt;
			}
		}
		//출력
		for(int i = 0; i<a.length; i++) {
			for(int o = 0; o<a[i].length;o++) {
				System.out.print(a[i][o]+"\t");
			}
			System.out.println();
		}
	}
}