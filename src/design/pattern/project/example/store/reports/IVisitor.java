package design.pattern.project.example.store.reports;

import design.pattern.project.example.store.domain.Item;
import design.pattern.project.example.store.domain.ShoppingComplex;
import design.pattern.project.example.store.domain.Store;

public interface IVisitor {
	public void visit(ShoppingComplex shopComplex);
	public void visit(Store store);
	public void visit(Item item);
}
