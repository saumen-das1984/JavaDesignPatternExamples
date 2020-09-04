package design.pattern.project.example.store.reports;

public interface IBillingVisitable {
	public void accept(IBillingVisitor billingVisitor);
}
