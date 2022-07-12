package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;

public class NoFlyImpl implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Damn! I can't fly!");
	}

}