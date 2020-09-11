
public class E03 {

	public static void main(String[] args) {
/*
		int [][] arr = new int[5][5];
		int cnt = 0;
		for(int i = 0; i<arr.length ;i++) {
			cnt++;
			arr[i][0]=cnt;
			for(int o = 0; o<arr.length; o++) {
				arr[i][o]=(arr[i][0]+(5*o));
			}
		}
		for(int x = 0; x<arr.length; x++) {
			for(int y = 0; y<arr.length; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
			
			 //1 번 문제
*/
		
		
		
/*		int [][] arr = new int[5][5];
		int cnt = 0;
		for(int i = 0; i<arr.length ;i++) {
			for(int o = 0; o<i+1; o++) {
				cnt++;
				arr[i][o]=cnt;
				
			}
		}
		for(int x = 0; x<arr.length; x++) {
			for(int y = 0; y<arr.length; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();   //2번문제
*/
		int [][] arr = new int[5][5];
		int cnt1 = 0;
		int cnt2 = 0;
		boolean bool = true;
		for(int i = 0; i<arr.length ;i++) {
			if(bool) {
				for(int o = 0; o<arr.length; o++) {
					cnt1++;
					arr[i][o] = cnt1;
					if(cnt1 == 5 || cnt2==15) {
						cnt2=cnt1+5;
						bool=false;
					}
				}
			}else {
				for(int o = 0; o<arr.length;o++) {
					arr[i][o] = cnt2;
					cnt2--;
					if(cnt2==6||cnt2==15) {
						cnt1=cnt2+5;
						bool=true;
					}
				}
			}
		}
		
		for(int x = 0; x<arr.length; x++) {
			for(int y = 0; y<arr.length; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}//출력포함
		
	}

}
