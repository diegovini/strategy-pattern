package design.patterns.strategy.behavior.impl;

import design.patterns.strategy.behavior.FlyBehavior;
import design.patterns.strategy.behavior.QuackBehavior;

public class ScreamingQuackImpl implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("QUAAACKKKKKKKK! QUAAACKKKKKKKK!");
	}

}