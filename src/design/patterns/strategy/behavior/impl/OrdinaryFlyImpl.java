package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;

public class OrdinaryFlyImpl implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm a ordinary flyer!!");
	}

}
