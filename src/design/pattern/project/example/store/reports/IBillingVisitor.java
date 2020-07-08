package design.pattern.project.example.store.reports;

import design.pattern.project.example.store.domain.CartItem;
import design.pattern.project.example.store.domain.ShoppingCart;

public interface IBillingVisitor {
	public void visit(ShoppingCart shopCart);
	public void visit(CartItem item);
}
