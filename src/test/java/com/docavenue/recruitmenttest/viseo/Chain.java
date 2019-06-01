package com.docavenue.recruitmenttest.viseo;

public class Chain {

	private Element first;
	private Element last;

	/**
	 * Constructor
	 */
	public Chain() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param first
	 * @param last
	 */
	public Chain(Element first, Element last) {
		super();
		this.first = first;
		this.last = last;
	}

	/**
	 * Get the first {@link Element}
	 *
	 * @return
	 */
	public Element first() {
		return first;
	}

	/**
	 * Get the last {@link Element}
	 *
	 * @return
	 */
	public Element last() {
		return last;
	}

	/**
	 * Is this Chain is empty
	 *
	 * @return true if the Chain is empty
	 */
	public boolean isEmpty() {
		return first == null && last == null;
	}
}
