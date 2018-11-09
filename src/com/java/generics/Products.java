package com.java.generics;

public class Products<L1, L2> {

	L1 itemOne;
	L2 itemTwo;

	public Products(L1 itemOne, L2 itemTwo) {
		super();
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
	}

	public Products() {
		super();
	}

	public L1 getItemOne() {
		return itemOne;
	}

	public void setItemOne(L1 itemOne) {
		this.itemOne = itemOne;
	}

	public L2 getItemTwo() {
		return itemTwo;
	}

	public void setItemTwo(L2 itemTwo) {
		this.itemTwo = itemTwo;
	}

	@Override
	public String toString() {
		return "Products [itemOne=" + itemOne + ", itemTwo=" + itemTwo + "]";
	}

}
