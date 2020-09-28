
public class Member {
	private String name;
	private String phoneNum;
	private String num;
	private String sexS;
	private int age;

	public Member() {}
	public Member(String name, String num, String phoneNum) {
		this.name = name;
		this.num = num;
		this.phoneNum =phoneNum;
		this.sexS = makesexS(Integer.parseInt(this.num.substring(7,8)));
		this.age = makeage(Integer.parseInt(this.num.substring(0,2)));
	}

	public String makesexS(int a) {
		String sexS;
		if(a == 1 || a == 3 || a == 5) {
			sexS = "남";
		}else {
			sexS = "여";
		}
		return sexS;
		}

	public int makeage(int year) {
		int age =(2020-(1900+year));
		return age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSexS() {
		return sexS;
	}
	public void setSexS(String sexS) {
		this.sexS = sexS;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}