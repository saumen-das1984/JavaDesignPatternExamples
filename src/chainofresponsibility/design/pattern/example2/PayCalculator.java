package chainofresponsibility.design.pattern.example2;

public abstract class PayCalculator {
	private PayCalculator next;
	
	public PayCalculator(PayCalculator next) {
		super();
		this.next = next;
	}
	public final double calculatePayment(double baseAmount, PayGrade payGrade){
		double amount = calculate(baseAmount, payGrade);
		if(next != null) {
			amount = next.calculatePayment(amount, payGrade);
		}
		return amount;
	}
	protected double calculate(double baseAmount, PayGrade payGrade) {
		return baseAmount;
	}
}
