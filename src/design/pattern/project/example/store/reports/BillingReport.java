package design.pattern.project.example.store.reports;

import design.pattern.project.example.store.domain.CartItem;
import design.pattern.project.example.store.domain.Item;
import design.pattern.project.example.store.domain.ShoppingCart;

public class BillingReport implements IBillingVisitor {

	double subTotal=0.0;
	@Override
	public void visit(ShoppingCart shopCart) {
		// TODO Auto-generated method stub
		System.out.println("BillingReport:visit(ShoppingCart) : set some attributes");
	}

	@Override
	public void visit(CartItem cartItem) {
		// TODO Auto-generated method stub
		subTotal = subTotal + cartItem.getQuantity()*((cartItem.getItem()).getPrice());
	}

	public double getSubTotal() {
		return subTotal;
	}
	
	

}
