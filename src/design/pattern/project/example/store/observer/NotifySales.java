package design.pattern.project.example.store.observer;

import design.pattern.project.example.store.domain.Customer;


public abstract class NotifySales {
	public abstract void addObserver(NotifySalesObserver customerObserver);
	public abstract void removeObserver(NotifySalesObserver customerObserver);
	public abstract void doNotify();		
}
