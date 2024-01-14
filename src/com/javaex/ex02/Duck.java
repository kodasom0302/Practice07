package com.javaex.ex02;

public class Duck extends Bird {
	
	private String name;

	public void sing() {
		System.out.println("오리("+this.name+")가 소리내어 웁니다.");
	}
	public void fly() {
		System.out.println("오리("+this.name+")가 날지 않습니다.");
	}
	public void setName() {
		
	}
	public void getName() {
		
	}
	public void showName() {
		System.out.println("오리의 이름은 "+this.name+" 입니다.");
	}

}
