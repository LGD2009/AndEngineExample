package org.andengine.util.adt.queue;

import org.andengine.util.adt.list.ShiftList;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 17:06:49 - 03.01.2012
 */
public class ShiftQueue<T> extends ShiftList<T> {

	public ShiftQueue() {
		super();
	}

	public ShiftQueue(final int pInitialCapacity) {
		super(pInitialCapacity);
	}

	@Override
	public T peek() {
		if(this.isEmpty()) {
			return null;
		} else {
			return this.get(0);
		}
	}

	@Override
	public T poll() {
		if(this.isEmpty()) {
			return null;
		} else {
			return this.remove(0);
		}
	}

	@Override
	public void enter(final T pItem) {
		this.add(pItem);
	}

	@Override
	public void enter(final int pIndex, final T pItem) throws IndexOutOfBoundsException {
		this.add(pIndex, pItem);
	}
}
