package strategy.design.pattern.example1;

import strategy.design.pattern.example1.strategy.PayStrategy;

public class PayCycle {
	private PayStrategy strategy;
	
	public PayCycle(PayStrategy strategy) {
		this.strategy = strategy;
	}

	public void generatePayCheck(Employee e) {
		System.out.println("Employee: " + e.getEmpName() +" will get " + strategy.execute(e));
	}
}
