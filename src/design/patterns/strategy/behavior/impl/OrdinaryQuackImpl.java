package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;
import design.patterns.strategy.behavior.QuackBehavior;

public class OrdinaryQuackImpl implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack! Quack!!");
	}

}