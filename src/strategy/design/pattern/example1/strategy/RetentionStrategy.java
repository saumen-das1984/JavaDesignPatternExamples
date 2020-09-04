package strategy.design.pattern.example1.strategy;

import strategy.design.pattern.example1.Employee;

public class RetentionStrategy implements PayStrategy {
	private static final double RETENTION_BONUS = 0.05; 
	@Override
	public double execute(Employee e) {
		return e.getBasePay() * (1 + RETENTION_BONUS);
	}

}
