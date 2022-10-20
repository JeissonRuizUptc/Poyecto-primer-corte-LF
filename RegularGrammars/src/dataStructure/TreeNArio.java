package dataStructure;

import java.util.Comparator;

public class TreeNArio<T> {

	protected Node<T> root;
	protected Comparator<T> comparator;

	public TreeNArio(T data, Comparator<T> comparator) {
		this.root = new Node<T>(data);
		this.comparator = comparator;
	}

	public void addSon(T father, T data) {
		addSon(this.root, father, data);
	}

	private void addSon(Node<T> root, T father, T data) {
		if (this.comparator.compare(father, root.data) != 0) {
			for (Node<T> node : root.sons) {
				addSon(node, father, data);
			}
		} else {
			root.sons.add(new Node<T>(root, data));
		}
	}

	public Node<T> search(T data) {
		return (this.root != null) ? search(this.root, data) : null;
	}

	public Node<T> getRoot() {
		return root;
	}

	public Comparator<T> getComparator() {
		return comparator;
	}

	private Node<T> search(Node<T> root, T data) {
		if (this.comparator.compare(root.data, data) == 0) {
			return root;
		} else if (root.sons.isEmpty()) {
			return null;
		} else {
			for (int i = 0; i < root.sons.size(); i++) {
				Node<T> aux = search(root.sons.get(i), data);
				if (aux != null) {
					return aux;
				}
			}
			return null;
		}
	}
}
