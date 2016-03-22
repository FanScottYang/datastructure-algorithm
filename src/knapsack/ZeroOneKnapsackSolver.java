package knapsack;

import java.util.List;

import knapsack.model.Item;
import knapsack.model.Knapsack;

/**
 * The most common problem being solved is the 0-1 knapsack problem, which
 * restricts the number xi of copies of each kind of item to zero or one. Given
 * a set of n items numbered from 1 up to n, each with a weight wi and a value
 * vi, along with a maximum weight capacity W,
 * <p>
 * This class uses dynamic programming solution. The other solution is :
 * Meet-in-the-middle
 * 
 * @author YangFan
 * @see https://en.wikipedia.org/wiki/Knapsack_problem
 */
public class ZeroOneKnapsackSolver {
	private List<Item> itemList;
	private Knapsack knapsack;

	public ZeroOneKnapsackSolver(List<Item> itemList, Knapsack knapsack) {
		super();
		this.itemList = itemList;
		this.knapsack = knapsack;
	}

	public void solve() {
		int[] m = new int[knapsack.getSize() + 1];
		// Initialize
		for (int i = 0; i < m.length; i++) {
			m[i] = 0;
		}

		for (int i = 0; i < itemList.size(); i++) {
			for (int j = knapsack.getSize(); j >= itemList.get(i).getWeight(); j--) {
				if (m[j - itemList.get(i).getWeight()]
						+ itemList.get(i).getValue() > m[j]) {
					m[j] = m[j - itemList.get(i).getWeight()]
							+ itemList.get(i).getValue();
				}
			}
			m[i] = 0;
		}

		knapsack.setValue(m[knapsack.getSize()]);
		// TODO: Need to know which items are put into the knapsack.

	}
}
