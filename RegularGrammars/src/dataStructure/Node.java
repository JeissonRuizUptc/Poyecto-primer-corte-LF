package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	protected Node<T> father;
	protected List<Node<T>> sons;
	protected T data;

	/**
	 * @param data Builder method
	 */
	public Node(T data) {
		// TODO Auto-generated constructor stub
		this.father = null;
		this.sons = new ArrayList<Node<T>>();
		this.data = data;
	}

	/**
	 * @param father
	 * @param data   Builder method
	 */
	public Node(Node<T> father, T data) {
		this.father = father;
		this.data = data;
		this.sons = new ArrayList<Node<T>>();
	}

	/**
	 * @return the father
	 */
	public Node<T> getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(Node<T> father) {
		this.father = father;
	}

	/**
	 * @return the sons
	 */
	public List<Node<T>> getSons() {
		return sons;
	}

	/**
	 * @param sons the sons to set
	 */
	public void setSons(List<Node<T>> sons) {
		this.sons = sons;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
}
