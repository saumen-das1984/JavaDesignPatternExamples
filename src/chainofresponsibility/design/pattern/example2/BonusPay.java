package chainofresponsibility.design.pattern.example2;

public class BonusPay extends PayCalculator {

	private double bonusFactor;
	
	public BonusPay(PayCalculator next, double bonusFactor) {
		super(next);
		this.bonusFactor = bonusFactor;
	}

	@Override
	public double calculate(double baseAmount, PayGrade payGrade) {
		
		double effectiveBonusFactor = findBonusAmount(payGrade);
		double bonus = baseAmount + effectiveBonusFactor * bonusFactor;
		return bonus;
	}

	private double findBonusAmount(PayGrade payGrade) {
		double effectiveBonusFactor = 1;
		switch (payGrade){
		case P1:
			effectiveBonusFactor = 100;
			break;
		case P2:
			effectiveBonusFactor = 150;
			break;
		case P3:
			effectiveBonusFactor = 200;
			break;
		case P4:
			effectiveBonusFactor = 300;
			break;
		}
		return effectiveBonusFactor;
	}

}
