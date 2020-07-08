package strategy.design.pattern.example1.strategy;

import strategy.design.pattern.example1.Employee;

public class RegularPayStrategy implements PayStrategy {

	@Override
	public double execute(Employee e) {
		return e.getBasePay();
	}

}
