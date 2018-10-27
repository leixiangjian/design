package com.design.pattern.factory.create;

import com.design.pattern.factory.product.Prizza;

public abstract class PrizzaStore {
	public void orderPrizza(){};
	public abstract Prizza createPrizza();
}
