/* 검색
 * 1.선형 검색  <-- 현재
 * 2.이진 검색
 */

public class E03 {

	public static void main(String[] args) {
		int data[] = { 1,5,7,9,2,97,57,346,35,24,21,7};
		int search = 100; // 검색'
		boolean bool = true;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == search) {
				System.out.print("찾았냐? -> "+data[i]+"\t");
				System.out.println("순서는 ->"+i);
				bool = false;
				break; // break; 여러개가 아닌 하나만 찾고 싶을때 break
			}
		}
		if(bool) {
			System.out.println("검색이 되지 않았습니다");
		}

	}

}
