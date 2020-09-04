package chainofresponsibility.design.pattern.example2;

public class ConveyancePay extends PayCalculator {
	private static final int CONVEYANCE_AMOUNT = 200;
	
	public ConveyancePay(PayCalculator next) {
		super(next);
	}

	@Override
	public double calculate(double baseAmount, PayGrade payGrade) {
		return baseAmount + CONVEYANCE_AMOUNT;
	}

}
