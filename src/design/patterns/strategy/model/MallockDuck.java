package design.patterns.strategy.model;

import design.patterns.strategy.behavior.impl.OrdinaryFlyImpl;
import design.patterns.strategy.behavior.impl.OrdinaryQuackImpl;

public class MallockDuck extends Duck {
	
	public MallockDuck() {
		setFlyBehavior(new OrdinaryFlyImpl());
		setQuackBehavior(new OrdinaryQuackImpl());
	}

	@Override
	public void display() {
		System.out.println("I am a Mallock duck!");
	}

}