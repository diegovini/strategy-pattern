package design.patterns.strategy.main;

import design.patterns.strategy.behavior.FlyBehavior;
import design.patterns.strategy.behavior.QuackBehavior;
import design.patterns.strategy.behavior.impl.RocketFlyImpl;
import design.patterns.strategy.behavior.impl.ScreamingQuackImpl;
import design.patterns.strategy.examples.StrategyPatternExamples;
import design.patterns.strategy.model.Duck;
import design.patterns.strategy.model.MallockDuck;
import design.patterns.strategy.model.RubberDuck;

public class Application {

	public static void main(String[] args) {
		StrategyPatternExamples example = new StrategyPatternExamples();
		example.rubberDuckExample();		
	}

	

}