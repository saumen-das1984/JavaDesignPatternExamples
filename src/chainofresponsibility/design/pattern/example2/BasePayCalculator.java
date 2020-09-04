package chainofresponsibility.design.pattern.example2;

public class BasePayCalculator extends PayCalculator{
	public BasePayCalculator(PayCalculator next) {
		super(next);
	}

	public  double calculate(double baseAmount, PayGrade payGrade){
		double basePay = 0;
		switch (payGrade){
		case P1:
			basePay = baseAmount + 10000;
			break;
		case P2:
			basePay = baseAmount + 12000;
			break;
		case P3:
			basePay = baseAmount + 14000;
			break;
		case P4:
			basePay = baseAmount + 18000;
			break;
		}
		return basePay;
	}
}
