package com.codility;

public class Pair {
	private int value;
	private int index;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}
	

	@Override
	public String toString() {
		return "Pair [value=" + value + ", index=" + index + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public Pair(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	
	
	
	
	
}
