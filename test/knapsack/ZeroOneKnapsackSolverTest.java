package knapsack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import knapsack.model.Item;
import knapsack.model.Knapsack;

import org.junit.Test;

public class ZeroOneKnapsackSolverTest {

	@Test
	public void test() {
		List<Item> itemList = new ArrayList<Item>();
		Knapsack knapsack = new Knapsack(10);
		itemList.add(new Item(5,1));
		itemList.add(new Item(4,2));
		itemList.add(new Item(3,3));
		itemList.add(new Item(2,4));
		itemList.add(new Item(1,5));
		ZeroOneKnapsackSolver solver = new ZeroOneKnapsackSolver(itemList, knapsack);
		solver.solve();
		
		assertTrue(knapsack.getValue() == 14);
	}

}
