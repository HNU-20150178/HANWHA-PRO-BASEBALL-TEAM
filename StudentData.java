
public class StudentData {
	//메소드 구현
	public void stuSort(Student[] student, int cnt) { // 클래스배열을 받아 선언된 참조변수 하나와 인원수에 해당하는 cnt변수를 받음
		for(int x = 0; x<cnt -1; x++) {
			for(int y=x+1; y<cnt; y++) {
				if(student[x].sNum > student[y].sNum) {
					Student temp = student[x];
					student[x] = student[y];
					student[y] = temp;
				}
			}
		}
	}
}
