
public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[5][5]; // 이럴떄 다중 for 문
		int cnt = 0;
		for(int x = 0; x<a.length-1;x++) {
			
			for(int y = 0; y<a[x].length-1; y++) {
				cnt++;
				a[x][y]=cnt;
			}
			a[x][a.length-1]=a[x][0]+a[x][1]+a[x][2]+a[x][3];
		}
		cnt = 0;
		for(int x=0; x<a.length; x++) {//일단입력해줄수잇는 것
			for(int y=0; y<a.length-1;y=0) {
				cnt ++;
				a[x][y]=cnt;
				a[x][4]+=cnt;
				a[4][x]+=cnt;
				a[4][4]+=cnt;
			}
			 
		}
		//가로 , 세로 합계
		//출력
		for(int i = 0; i<a.length; i++) {
			for(int o = 0; o<a[i].length;o++) {
				System.out.print(a[i][o]+"\t");
			}
			System.out.println();
		}
	}
}