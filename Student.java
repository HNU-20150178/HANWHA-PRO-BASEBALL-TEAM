package com.jslhrd.exam;

public class Student {
	private int bun;
	private String name;
	private int tot;
	private double ave;
	private int rank; //석차
	
	
	public Student() {}
	public Student(int bun, String name, int tot) {
		this.bun = bun;
		this.name = name;
		this.tot = tot;
		this.ave = makeAve(tot);
		this.rank = makerank();
	}
	public double makeAve(int tot) {
		double ave=tot/3.0;
		return ave;
		}
	public int makerank() {
		int rank = 1;
		return rank;
	
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
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
