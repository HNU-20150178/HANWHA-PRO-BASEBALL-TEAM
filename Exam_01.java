import java.text.MessageFormat;

// ID : xxx    이름: xxx    전화 : xxx

public class Exam_01 {
	public static void main(String[] args) {
		String id = "aaaa";
		String name = "홍길동";
		String cellNum = "010-6647-3424";
		
		
		String str = "ID :" + id + "\t이름 :" + name + "\t폰번호 : " + cellNum;
		System.out.println(str);
		
		String message = "ID : {0}\t이름 : {1} \t폰번호 : {2}";
		String result = MessageFormat.format(message, id, name, cellNum);
		System.out.println(result);
		
	}
}
