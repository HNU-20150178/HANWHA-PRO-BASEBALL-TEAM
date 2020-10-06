import java.io.File;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("Exam_01.java"));
		while(scn.hasNextLine()) {
			System.out.println(scn.nextLine());
		}		
	}

}
