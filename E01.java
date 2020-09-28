public class E01 {

	public static void main(String[] args) {
		String data = "2020-09-28";
		String y = data.substring(0,4);
		String m = data.substring(5,7);
		String d = data.substring(8);
		String dataa = "1 2 3 4 ";
		dataa.trim(); // 공백 제거
		System.out.println(dataa);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		
		
		boolean bool = true;
		String s = bool+"";
		String ss = String.valueOf(bool);
		System.out.println(ss);
		
		int a = 100;
		String sss = a + ""; // "100" 하지만 "100a" 같은건 안됨
		int aa = Integer.parseInt(sss); // 문자열을 정수로
		
		
		/*String str = "HRD_SKorea#Java_SpringFramework";
		int x = str.indexOf("S",5); // indexOf(찾고싶은문자,앞에서부터몇문자뒤부터검색)
		System.out.println(x);
		System.out.println(str.contains("Frame")); // 포함되어있는지 bolean으로
		String [] s = str.split("_"); //.split("규칙")규칙이 있어야 사용가능
		for (int i = 0; i < str.length(); i++){
			System.out.println(s[i]);
		}
		*/		/*String str = "HRD_Korea#Java_SpringFramework";
		// 문자열 길이
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i); // 문자 하나씩 끊을 수 있게하는 메소드
			System.out.println(ch);
		}
		str.concat("123456789"); // .concat("결합하고싶은 문자열")
		System.out.println(str);
		*/
	}

}
