package Test01;
class Mem{
	private String user;
	private String name;
	private int age;
	Mem(){}
	Mem(String user, String name, int age){
		this.user=user;
		this.name=name;
		this.age=age;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return user + "\t" + name + "\t" + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mem) {
			Mem m = (Mem)obj;
			return m.user.equals(user);
		}else {
			return false;
		}
	}
}



public class Exam_05data {

}
