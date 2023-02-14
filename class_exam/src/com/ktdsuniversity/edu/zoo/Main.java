package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Animal;
import com.ktdsuniversity.edu.zoo.inf.Crwalable;
import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Main {
	
	public static void run(Animal animal) {
		animal.eat();
		animal.bark();
		
		// 일일이 if 검사 다함.
		if (animal instanceof Walkable) {
			((Walkable) animal).walk();
		}
		
		if (animal instanceof Runable) {
			((Runable) animal).run();
		}
		
		if (animal instanceof Flyable) {
			((Flyable) animal).fly();
		}
		
		if (animal instanceof Swimable) {
			((Swimable) animal).swim();
		}
		
		if (animal instanceof Crwalable) {
			((Crwalable) animal).crwal();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("메리");
		run(lion);
		
		Animal duck = new Duck("꽥꽥");
		run(duck);
		
		Animal elephant = new Elephant("긴 코");
		run(elephant);
		
		
		
	}
}