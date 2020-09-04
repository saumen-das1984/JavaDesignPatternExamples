package design.pattern.project.example.store.domain;

import design.pattern.project.example.store.reports.IBillingVisitor;
import design.pattern.project.example.store.reports.IVisitable;
import design.pattern.project.example.store.reports.IVisitor;

/*
 * The item object in the stores
 */
public class Item implements IVisitable {
private String name;
private String id;
private String storeId;
private Integer price;

private boolean inStock;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getStoreId() {
	return storeId;
}
public void setStoreId(String storeId) {
	this.storeId = storeId;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}


@Override
public void accept(IVisitor visitor) {
	visitor.visit(this);
	
}




}
