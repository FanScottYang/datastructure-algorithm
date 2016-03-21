package disjointset;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 
 * @see https://en.wikipedia.org/wiki/Disjoint-set_data_structure
 * @author YangFan
 *
 */
public class DisjointSet<E> implements Serializable {

	private static final long serialVersionUID = -6843122418270383993L;

	transient HashMap<E, E/* parent */> elementData = new HashMap<E, E>();

	// TODO: add a remove method to remove an element. Need to rebuild the
	// relationship.

	/**
	 * Use "path compression" method to keep tree balanced. The other method is
	 * called "union by rank".
	 * 
	 * @param x
	 */
	public E find(E e) {
		E parent = elementData.get(e);

		if (parent != null && !parent.equals(e)) {
			parent = find(parent);
		} else {
			parent = e;
		}
		elementData.put(e, parent);
		return parent;
	}

	public void union(E x, E y) {
		E xRoot = find(x);
		E yRoot = find(y);
		elementData.put(xRoot, yRoot);
	}
}
