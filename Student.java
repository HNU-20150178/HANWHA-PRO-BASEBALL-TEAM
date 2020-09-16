
public class Student {
	int sNum;
	String sName;
	int sAge;
	
	public Student() {}
	public Student(int sNun, String sName, int sAge) {
		this.sNum = sNun;
		this.sName = sName;
		this.sAge = sAge;
	}
	public void stuPrint() {
		System.out.println(sNum+"\t"+sName+"\t"+sAge);
	}
	
}
