package design.patterns.strategy.examples;

import design.patterns.strategy.behavior.FlyBehavior;
import design.patterns.strategy.behavior.QuackBehavior;
import design.patterns.strategy.behavior.impl.NoFlyImpl;
import design.patterns.strategy.behavior.impl.OrdinaryQuackImpl;
import design.patterns.strategy.behavior.impl.RocketFlyImpl;
import design.patterns.strategy.behavior.impl.ScreamingQuackImpl;
import design.patterns.strategy.model.Duck;
import design.patterns.strategy.model.MallockDuck;
import design.patterns.strategy.model.RubberDuck;

public class StrategyPatternExamples {
	public void mallockDuckExample() {
		Duck mallockDuck = new MallockDuck();
		mallockDuck.display();
		mallockDuck.performQuack();
		mallockDuck.performFly();
		System.out.println("\n=====Mallock Duck now screams because he saw something suspicious====\n");
		mallockDuck.display();
		changeBehavior(mallockDuck, mallockDuck.getFlyBehavior(), new ScreamingQuackImpl());
		mallockDuck.performQuack();
	}

	public void rubberDuckExample() {
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		System.out.println("\n=====Rubber Duck now get on a space rocket!====\n");

		changeBehavior(rubberDuck, new RocketFlyImpl(), new ScreamingQuackImpl());
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();

		System.out.println("\n=====Rubber Duck now gets back on Earth!====\n");

		changeBehavior(rubberDuck, new NoFlyImpl(), new OrdinaryQuackImpl());
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}

	private void changeBehavior(Duck duck, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		duck.setFlyBehavior(flyBehavior);
		duck.setQuackBehavior(quackBehavior);
	}

}