import java.util.*;
public class collectionListInterface02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // <>에 쓰는 것을 genetic타입
		list.add(new Integer(100));
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		int tot =0;
		for(int x = 0; x<list.size(); x++) {
			int score = list.get(x);
			tot+=score;
			System.out.println(score);
		}
		System.out.println(tot);
		
		
		
		/*
		 * List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		int tot =0;
		for(int x = 0; x<list.size(); x++) {
			int score = (int)list.get(x);
			tot+=score;
			System.out.println(score);
		}
		System.out.println(tot);
		 */
	}

}
