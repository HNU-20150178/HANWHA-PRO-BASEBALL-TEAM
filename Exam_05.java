import java.io.*;
import java.util.*;

public class Exam_05 {

	public static void main(String[] args) {
		StringTokenizer st = null;
		try{
		Scanner scn = new Scanner(new File("c:\\data\\student.txt"));
		while(scn.hasNextLine()) { // hasnext로 존재하면 읽어오고 하는 방식
			String ss = scn.nextLine();
			int cnt = 0;
			int tot = 0;
			st = new StringTokenizer(ss,", ");
			while(st.hasMoreElements()) { // 더 있다면? 없으면 false 출력하는 메소드
				System.out.print(st.nextToken()+"\t"); //nextToken
				cnt++;
				if(cnt == 2 || cnt == 4) {
					tot += Integer.parseInt(st.nextToken());
					if(cnt == 4) {
						cnt=0;
					}
				}
				System.out.println(tot + "\t");
			}
			System.out.println();
		}
		
		}catch(Exception e) {
			System.out.println("파일 없음");
		}
	}

}
