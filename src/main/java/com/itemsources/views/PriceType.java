package com.itemsources.views;

public enum PriceType
{

	GE(0),
	HA(1);

	private final int value;

	PriceType(final int newValue) {
		value = newValue;
	}

	public int getValue() { return value; }
}
