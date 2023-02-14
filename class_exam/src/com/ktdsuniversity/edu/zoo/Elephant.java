package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Elephant implements Runable, Walkable{
	
	private String name;
	
	public Elephant(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("코끼리 " + name + "먹는다.");
	}

	@Override
	public void bark() {
		System.out.println("코끼리 " + name + "짓는다.");
	}

	@Override
	public void walk() {
		System.out.println("코끼리 " + name + "걷는다.");
	}

	@Override
	public void run() {
		System.out.println("코끼리 " + name + "뛴다.");
	}
}
