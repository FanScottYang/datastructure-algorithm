package knapsack.model;

public class Item {
	private int weight;
	private int value;

	public Item(int weight, int value) {
		super();
		this.weight = weight;
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
