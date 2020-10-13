import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Timeexam {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		SimpleDateFormat sdf1;
		sdf1 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(today);
		System.out.println(sdf1.format(today));
		System.out.println(now);
	}

}
