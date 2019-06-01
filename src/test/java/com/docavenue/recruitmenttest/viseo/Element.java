package com.docavenue.recruitmenttest.viseo;

import lombok.Getter;

@Getter
public class Element {
	private Chain parent;
	private Element prev;
	private Element next;

	/**
	 * Constructor
	 */
	public Element() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param parent
	 * @param prev
	 * @param next
	 */
	public Element(Chain parent, Element prev, Element next) {
		super();
		this.parent = parent;
		this.prev = prev;
		this.next = next;
	}

	/**
	 * Remove this Element
	 */
	public void remove() {
		// If the element doesn't already belong to a chain OR it's the only element in
		// the Chain
		if (this.parent == null || (this.isFirst() && this.isLast())) {
			kill();
			return;
		}

		if (this.next != null && this.parent.equals(this.next.getParent())) {
			this.next.prev = this.prev;
		} else if (this.next == null) {
			// Case when this Element is the last of the Chain
			this.prev.next = null;
		}

		if (this.prev != null && this.parent.equals(this.prev.getParent())) {
			this.prev.next = this.next;
		} else if (this.prev == null) {
			// Case when this Element is the first of the Chain
			this.next.prev = null;
		}

		// Destroy this Element anyway
		kill();
	}

	/**
	 * Kill this element
	 */
	private void kill() {
		this.next = null;
		this.prev = null;
		this.parent = null;
	}

	/**
	 * Is this Element the first of the Chain
	 *
	 * @return
	 */
	public boolean isFirst() {
		return this.prev == null;
	}

	/**
	 * Is this Element the last of the Chain
	 *
	 * @return
	 */
	public boolean isLast() {
		return this.next == null;
	}

	/**
	 * Is this Element Orphan
	 *
	 * @return
	 */
	public boolean isOrphan() {
		return this.parent == null;
	}

}
