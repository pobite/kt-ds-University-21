package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Duck implements Flyable, Runable, Swimable, Walkable {
		
	private String name;

	public Duck(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + "이 먹는다");
	}

	@Override
	public void bark() {
		System.out.println("오리 " + name + "이 짓는다.");	
	}

	@Override
	public void walk() {
		System.out.println("오리 " + name + "이 걷는다.");	
	}

	@Override
	public void swim() {
		System.out.println("오리 " + name + "이 수영한다.");	
	}

	@Override
	public void run() {
		System.out.println("오리 " + name + "이 뛴다.");	
	}

	@Override
	public void fly() {
		System.out.println("오리 " + name + "이 난다.");	
	}
}
