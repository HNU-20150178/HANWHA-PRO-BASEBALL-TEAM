
public class E04 {
	public static void main(String[] args) {
		int[] data = {10,20,30,35,40,60,65,70,80,85,90,95};
		int search = 55; // 검색값
		int low = 0;
		int high = data.length-1;
		boolean bool = true;
		while(low<=high) {
			int mid = (low+high)/2;
			if(data[mid]==search) {
				System.out.println(mid+"번재");
				bool = false;
				break;
			}
			if(data[mid]<search) {
				low = mid + 1;
			}else {
				high=mid-1;
			}
		}
		if(bool) {
			System.out.println("없어요");
		}
	}
}
