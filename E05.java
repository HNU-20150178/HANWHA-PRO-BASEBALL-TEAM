import java.util.Scanner;

/* dat[] 배열에 정수가 n 개 오름찻군으로 정렬 되어 있다.
 * 키보드로 찾을 값을 입력하면 위치를 찾아 출력하는 프로그램 작성
 * 
 */
public class E05 {
	static int data[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
	/*
	 * static int search(int val){
	 * int low = 0;
	 * int high = data.length-1;
	 * while(low<=high){
	 * int m=(low+high)/2';
	 * if (data[m]==val){
	 * reutrn m;
	 * }
	 * if(data[m]<val){
	 * low=m+1;
	 * }else{
	 * high = m-1;
	 * }
	 * }return -1
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int low =0;
			int high = data.length-1;
			boolean bool = true;
			System.out.print("찾는 값 입력(1~100):");
			int search = scanner.nextInt();
			if(search == - 99) {
				System.out.println("프로그램을 종료합니다");
				System.exit(1);
				break;
			}
			if(search>100 || search < 1) {
				System.out.println("입력값 범위 오류입니다. 다시 입력해 주세요.");
				continue;
			}
			while(low<=high) {
				int mid = (low+high)/2;
				if(data[mid] == search) {
					System.out.println("찾는 값 "+mid+"번째 있음");
					bool = false;
				}
				if (data[mid]<search) {
					low = mid+1;
				}else {
					high = mid-1;
				}
				
			}
			if(bool) {
				System.out.println("찾는값 "+search+"는 없읍니다");
			}
		}
		scanner.close();
	}
}
