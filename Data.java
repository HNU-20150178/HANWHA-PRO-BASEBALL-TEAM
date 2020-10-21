package test01;

public class Data{
	private int bun;
	private String name;
	private int jum;
	
	Data(){}
	Data(int bun, String name, int jum){
		this.bun=bun;
		this.name=name;
		this.jum=jum;
	}
	
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJum() {
		return jum;
	}
	public void setJum(int jum) {
		this.jum = jum;
	}
	
	@Override
	public String toString() {
		return bun +"\t"+name+"\t"+jum;
	}
}
