package com.koreait.spring;

public class Gun {
	private String model;
	private int bullet;
	
	public Gun() {
		// TODO Auto-generated constructor stub
	}

	public Gun(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}
	
	public void gunInfo() {
		System.out.println("권총 : "+model);
		System.out.println("현재 총알 수 : "+bullet+"발");
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	
}
