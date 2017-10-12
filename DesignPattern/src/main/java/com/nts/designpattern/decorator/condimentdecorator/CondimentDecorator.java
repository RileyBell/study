package com.nts.designpattern.decorator.condimentdecorator;

import com.nts.designpattern.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
