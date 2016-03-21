package disjointset;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisjointSetTest {

	@Test
	public void test() {
		DisjointSet<Integer> set = new DisjointSet<Integer>();
		assertTrue(set.find(1) == 1);
		
		set.union(1, 2);
		assertTrue(set.find(1) == 2);
		
		set.union(1, 3);
		assertTrue(set.find(1) == 3);
		assertTrue(set.find(2) == 3);
		
		set.union(4, 1);
		assertTrue(set.find(4) == 3);
	}

}
