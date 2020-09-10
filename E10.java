
public class E10 {

	public static void main(String[] args) {
		int var[][] = new int[5][5];
		for(int i=0; i<var.length; i++) {
			for(int o=0; o<var[i].length; o++) {
				System.out.print(var[i][o]+"\t");
			}
			System.out.println();
		}/*
		int cnt=0;
		for(int i=0; i<var.length; i++) {
			for(int o=0; o<var[i].length; o++) {
				var[i][o]=++cnt;
			}
		}
		for(int i=0; i<var.length; i++) {
			for(int o=0; o<var[i].length; o++) {
				System.out.print(var[i][o]+"\t");
			}
			System.out.println();

		}*/
		System.out.println("================================");
		int cnt1=0;
		for(int i=0; i<var.length; i++) {
			for(int o=0; o<var[i].length-1; o++) {
				var[i][o]=++cnt1;
				//var[x[4]+=var[x][y];
				}
			}
		}
		for(int i=0; i<var.length; i++) {
			for(int o=0; o<var[i].length; o++) {
				System.out.print(var[i][o]+"\t");
			}
			System.out.println();
		}
	}
}