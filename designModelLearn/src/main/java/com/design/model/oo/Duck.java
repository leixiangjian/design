package com.design.model.oo;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBahavior quackBahavior;
	
	public void swim(){}
	public abstract void display();
	public void performQuack(){};
	public void performFly(){}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBahavior(QuackBahavior quackBahavior) {
		this.quackBahavior = quackBahavior;
	};
	
}
