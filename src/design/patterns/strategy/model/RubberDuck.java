package design.patterns.strategy.model;

import design.patterns.strategy.behavior.impl.NoFlyImpl;
import design.patterns.strategy.behavior.impl.OrdinaryQuackImpl;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		setFlyBehavior(new NoFlyImpl());
		setQuackBehavior(new OrdinaryQuackImpl());
	}


	@Override
	public void display() {
		System.out.println("I am a Rubber duck!");
	}

}
