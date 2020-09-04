package strategy.design.pattern.example1.strategy;

import strategy.design.pattern.example1.Employee;

public class StarPerformerStrategy implements PayStrategy {
	private static final double STAR_PERFORMER_BONUS = 0.2; 
	@Override
	public double execute(Employee e) {
		return e.getBasePay() * (1 + STAR_PERFORMER_BONUS);
	}

}
